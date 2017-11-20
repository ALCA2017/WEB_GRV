function webApiCall(){
    $.ajax({
        cache: false,
        data: $.extend({
            key			: 'AIzaSyBxoPDZ656i6Tw1cI9PvZsIF2FwwQZluRk',
            q			: $('#hyv-search').val(),
            cx			: '017576662512468239146:omuauf_lfve',
            num			: 5,
            cr			: 'es'
        }, {maxResults:5,pageToken:$("#pageToken").val()}),
        dataType: 'json',
        type: 'GET',
        timeout: 5000,
        url: 'https://www.googleapis.com/customsearch/v1'
    })
    .done(function(data) {
        var items = data.items, videoList = "";
        $.each(items, function(index,e) {
            var item = e.items[index];
            var title = item.htmlTitle;
            
            videoList = videoList + '<li class="hyv-video-list-item"><div class="hyv-content-wrapper">'+
            '<a href="'+item.link+'" class="hyv-content-link" title="'+title+'">'+
            '<span class="title">'+title+'</span>'+
            '<span class="stat attribution">by <span>'+item.displayLink+'</span></span></a>'+
            '</div><div class="hyv-thumb-wrapper"><a href="" class="hyv-thumb-link">'+
           // '<span class="hyv-simple-thumb-wrap">'+
           // '<img alt="'+e.snippet.title+'" src="'+item.link+'" width="120" height="90"></span>'+
            '</a></div></li>';
        });
        $("#hyv-read-related").html(videoList);
        // JSON Responce to display for user
        new PrettyJSON.view.Node({ 
            el:$(".hyv-watch-sidebar-body"), 
            data:data
        });
    });
}



var _prevIndex 		= 0;
var _nextIndex 		= 0;
var _resultsPerPage = 10;
var _pageNumber 	= 1;

$(function ()
{
	 console.log( "ready functionm!" );
    $('#btnSearch').show().click(function () { WebApiCall($("#txtSearchTerm").val(),0);});
    $('#lnkPrev').click(function () { Search($("#txtSearchTerm").val(),-1); });
    $('#lnkNext').click(function () { Search($("#txtSearchTerm").val(),1);  });
	
	console.log( "ready Termino a buscatr!"+$("#txtSearchTerm").val() );
}

);

function WebApiCall_antes(term, direction)
{
	console.log( "ready palabra a busar!" +term);
    var startIndex = 1;

    if (direction === -1)
    {
        startIndex = _prevIndex; 
        _pageNumber--;
    }
    if (direction === 1)
    {
        startIndex = _nextIndex; 
        _pageNumber++;
    }
    if (direction === 0)
    {
        startIndex = 1; 
        _pageNumber = 1;
    }
	var mGoogleApiKey 			= "AIzaSyBxoPDZ656i6Tw1cI9PvZsIF2FwwQZluRk";
	var mGoogleCustomSearchKey 	= "017576662512468239146:omuauf_lfve";
    var url = "https://www.googleapis.com/customsearch/v1?key="
    + mGoogleApiKey + "&num=10&cx=" + mGoogleCustomSearchKey + "&start=" + startIndex + "&q=" + escape(term) + "&callback=?";
    //+ mGoogleApiKey + "&num=10&cx=" + mGoogleCustomSearchKey + "&start=" + startIndex + "&q=" + escape(term) + "&callback=?";

 //   url = "http://hahndorf/ws/dummy.aspx?q=" + escape(term) + "&start=" + startIndex + "&callback=?";

    $.getJSON(url, '', SearchCompleted);
}

function SearchCompleted(response)
{
	
	console.log( "ready response!" );
    var html = "";
    $("#searchResult").html("");

    if (response.items == null)
    {
        $("#searchResult").html("No matching pages found");
        return;
    }

    if (response.items.length === 0)
    {
        $("#searchResult").html("No matching pages found");
        return;
    }

    $("#searchResult").html(response.queries.request[0].totalResults + " pages found for <b>" +response.queries.request[0].searchTerms+ "</b>");

    if (response.queries.nextPage != null)
    {
        _nextIndex = response.queries.nextPage[0].startIndex;
        $("#lnkNext").show();
    }
    else
    {
        $("#lnkNext").hide();
    }

    if (response.queries.previousPage != null)
    {
        _prevIndex = response.queries.previousPage[0].startIndex;
        $("#lnkPrev").show();
    }
    else
    {
        $("#lnkPrev").hide();
    }

    if (response.queries.request[0].totalResults > _resultsPerPage){
        $("#lblPageNumber").show().html(_pageNumber);
    }
    else{
        $("#lblPageNumber").hide();
    }

    for (var i = 0; i < response.items.length; i++){
        var item = response.items[i];
        var title = item.htmlTitle;
        
        html += "<p><a class='searchLink' href='" + item.link + "'> " + title + "</a><br>";
        html += item.snippet + "<br>";
        html += item.link + " - <a href='http://www.google.com/search?q=cache:"+item.cacheId+":"+item.displayLink+"'>Cached</a></p>";
    }
    $("#output").html(html);
}