function searchImagenes(){
	var txtVideo= $("#searchImg").val();
	var htmlContent="<ul>"; 

	$.ajax({
	  type: 'GET',
	  url: 'https://api.duckduckgo.com/',
	  data: { q: txtVideo, format: 'json', pretty: 1,iax:'images',ia:'images' },
	  jsonpCallback: 'jsonp',
	  dataType: 'jsonp'
	}).then(function (data) {
		for (var i = 0; i < 3;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
		}		    	
	  console.log(data);
	});
	htmlContent += "</ul>";
	$('#divImg').html(htmlContent);
}


function searchVideos(){
	var searchText= $("#searchVideo").val();
	//alert(searchText);
	var htmlContent="<ul>"; 
	$.getJSON('https://api.duckduckgo.com/?q='+searchText+'&t=ffsb&iax=videos&ia=videos&callback=jsonp',function(data){
	    for (var i = 0; i < 3;i++) {
	    //for (var i = 0; i < data.RelatedTopics.length;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	    }
	htmlContent += "</ul>";
	$('#divVideo').html(htmlContent);
	});
}

function searchWeb(){
	var searchText= $("#searchWeb").val();
	//alert(searchText);
	var htmlContent="<ul>"; 
	$.getJSON('https://api.duckduckgo.com/?q='+searchText+'&t=ffsb&ia=web&callback=jsonp',function(data){
	    for (var i = 0; i < 3;i++) {
	    //for (var i = 0; i < data.RelatedTopics.length;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	    }
	htmlContent += "</ul>";
	$('#divWeb').html(htmlContent);
	});
}

/*
 * 

function searchImagenes_2(){
	var searchText= $("#search1").val();
	//alert(searchText);
	var htmlContent="<ul>"; 
	$.getJSON('http://api.duckduckgo.com/?q='+searchText+'&format=json&pretty=1&iax=images&ia=images&callback=jsonp',function(data){
	    for (var i = 0; i < 3;i++) {
	    //for (var i = 0; i < data.RelatedTopics.length;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	    }
	htmlContent += "</ul>";
	$('#div1').html(htmlContent);
	});
}
* 
 * 
$.ajax({
  type: 'GET',
  url: 'https://api.duckduckgo.com/',
  data: { q: myhomestate, format: 'json', pretty: 1 },
  jsonpCallback: 'jsonp',
  listLocation: "RelatedTopics",
  dataType: 'text'
}).then(function (data) {
    console.log(data);
});
}
 * */
