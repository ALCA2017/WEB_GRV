
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

/*$(document).ready(function() {
    $("#hyv-searchBtn").on( "click", function( event ) {
        youtubeApiCall();
        return false;
    });
});*/
        
function youtubeApiCall(){
    $.ajax({
        cache: false,
        data: $.extend({
            key			: 'AIzaSyDCnKDKvGdkkK9yWt8OFKyyjFdp2cDto_g',
            q			: $('#hyv-search').val(),
            part		: 'snippet',
            maxResults	: 5,
            order		: 'rating',
            regionCode	: 'es',
            chart 		: 'mostPopular'
        }, {maxResults:5,pageToken:$("#pageToken").val()}),
        dataType: 'json',
        type: 'GET',
        timeout: 5000,
        url: 'https://www.googleapis.com/youtube/v3/search'
    })
    .done(function(data) {
        var items = data.items, videoList = "";
        $.each(items, function(index,e) {
            videoList = videoList + '<li class="hyv-video-list-item"><div class="hyv-content-wrapper"><a href="" class="hyv-content-link" title="'+e.snippet.title+'"><span class="title">'+e.snippet.title+'</span><span class="stat attribution">by <span>'+e.snippet.channelTitle+'</span></span></a></div><div class="hyv-thumb-wrapper"><a href="" class="hyv-thumb-link"><span class="hyv-simple-thumb-wrap"><img alt="'+e.snippet.title+'" src="'+e.snippet.thumbnails.default.url+'" width="120" height="90"></span></a></div></li>';
        });
        $("#hyv-watch-related").html(videoList);
        // JSON Responce to display for user
        new PrettyJSON.view.Node({ 
            el:$(".hyv-watch-sidebar-body"), 
            data:data
        });
    });
}


//Función que contiene paginador

/*
 * fuente
 * https://www.w3tweaks.com/youtube/search-youtube-videos-using-youtube-v3-api-using-jquery-ajax-call.html
 * 
 * 
 * $(document).ready(function() {
	  //  youtubeApiCall();
	    $("#pageTokenNext").on( "click", function( event ) {
	        $("#pageToken").val($("#pageTokenNext").val());
	        youtubeApiCall();
	    });
	    $("#pageTokenPrev").on( "click", function( event ) {
	        $("#pageToken").val($("#pageTokenPrev").val());
	        youtubeApiCall();
	    });
	    $("#hyv-searchBtn").on( "click", function( event ) {
	        youtubeApiCall();
	        return false;
	    });
	    jQuery( "#hyv-search" ).autocomplete({
	      source: function( request, response ) {
	        //console.log(request.term);
	        var sqValue = [];
	        jQuery.ajax({
	            type: "POST",
	            url: "http://suggestqueries.google.com/complete/search?hl=en&ds=yt&client=youtube&hjson=t&cp=1",
	            dataType: 'jsonp',
	            data: jQuery.extend({
	                q: request.term
	            }, {  }),
	            success: function(data){
	                console.log(data[1]);
	                obj = data[1];
	                jQuery.each( obj, function( key, value ) {
	                    sqValue.push(value[0]);
	                });
	                response( sqValue);
	            }
	        });
	      },
	      select: function( event, ui ) {
	        setTimeout( function () { 
	            youtubeApiCall();
	        }, 300);
	      }
	    });  
	});
	        
	function youtubeApiCall(){
	    $.ajax({
	        cache: false,
	        data: $.extend({
	            key			: 'AIzaSyDCnKDKvGdkkK9yWt8OFKyyjFdp2cDto_g',
	            q			: $('#hyv-search').val(),
	            part		: 'snippet',
	            maxResults	: 5,
	            order		: 'rating',
	            regionCode	: 'es',
	            chart 		: 'mostPopular'
	        }, {maxResults:5,pageToken:$("#pageToken").val()}),
	        dataType: 'json',
	        type: 'GET',
	        timeout: 5000,
	        url: 'https://www.googleapis.com/youtube/v3/search'
	    })
	    .done(function(data) {
	        if (typeof data.prevPageToken === "undefined") {$("#pageTokenPrev").hide();}else{$("#pageTokenPrev").show();}
	        if (typeof data.nextPageToken === "undefined") {$("#pageTokenNext").hide();}else{$("#pageTokenNext").show();}
	        var items = data.items, videoList = "";
	        $("#pageTokenNext").val(data.nextPageToken);
	        $("#pageTokenPrev").val(data.prevPageToken);
	        $.each(items, function(index,e) {
	            videoList = videoList + '<li class="hyv-video-list-item"><div class="hyv-content-wrapper"><a href="" class="hyv-content-link" title="'+e.snippet.title+'"><span class="title">'+e.snippet.title+'</span><span class="stat attribution">by <span>'+e.snippet.channelTitle+'</span></span></a></div><div class="hyv-thumb-wrapper"><a href="" class="hyv-thumb-link"><span class="hyv-simple-thumb-wrap"><img alt="'+e.snippet.title+'" src="'+e.snippet.thumbnails.default.url+'" width="120" height="90"></span></a></div></li>';
	        });
	        $("#hyv-watch-related").html(videoList);
	       
	        JSON Responce to display for user
	        new PrettyJSON.view.Node({ 
	            el:$(".hyv-watch-sidebar-body"), 
	            data:data
	        });
	    });
	}
	*
	*
	***/

/*
 * 
 * 
<div>
<input type="hidden" id="pageToken" value="">
<div class="btn-group" role="group" aria-label="...">
  <button type="button" id="pageTokenPrev" value="" class="btn btn-default">Prev</button>
  <button type="button" id="pageTokenNext" value="" class="btn btn-default">Next</button>
</div>
</div> 
 *
 *
 */