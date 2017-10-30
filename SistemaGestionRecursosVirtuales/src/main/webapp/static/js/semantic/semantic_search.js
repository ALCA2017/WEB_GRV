function searchAPI(){
	var searchText= $("#search1").val();
	var htmlContent="<ul>"; 
	$.getJSON('http://api.duckduckgo.com/?q=ashok&format=json&pretty=1&callback=?',function(data){
	    for (var i = 0; i < 3;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	    }
	htmlContent += "</ul>";
	$('#div1').html(htmlContent);
	})
}

function searchImagenes(){	
	var searchText= 'Barack Obama';//$("#search1").val();
	var htmlContent="<ul>"; 
	$.getJSON('http://api.duckduckgo.com/?q=ashok&format=json&pretty=1&callback=?',function(data){
		//$.getJSON('http://api.duckduckgo.com/?q='+searchText+'&format=json&pretty=1&iax=images&ia=images&callback=jsonp',function(data){		
		var nURL;
        if (data.RelatedTopics.length != "") {
        	for (var i = 0; i < 3; i++) {
            //for (var i = 0; i < data.RelatedTopics.length; i++) {
                var desc = data.RelatedTopics[i].Text;
                var url  = data.RelatedTopics[i].Icon.URL;
                var link = data.RelatedTopics[i].FirstURL;
                var data={
                    link: link,
                    url: url,
                    description: desc
                };                
                if (url !=""){nURL =url}else{nURL =link}                
                htmlContent += "<li><img src='" + nURL + "' style='width:30px;height:30px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
            }
        }		
        htmlContent += "</ul>";
        $('#divImg').html(htmlContent);
	});
} 

function searchVideos(){
	textoABuscar = 'ashok';//$('#txtABuscar').val();
	//var searchText= $("#searchVideo").val();
	var htmlContent="<ul>"; 
	$.getJSON('http://api.duckduckgo.com/?q=ashok&format=json&pretty=1&callback=?',function(data){
		//$.getJSON('https://api.duckduckgo.com/?q='+textoABuscar+'&t=ffsb&iax=videos&ia=videos&callback=jsonp&format=json&pretty=1',function(data){
	    for (var i = 0; i < 3; i++) {
	    //for (var i = 0; i < data.RelatedTopics.length;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent +="<a href='" + url + "' class='list-group-item list-group-item-action'>Dapibus ac facilisis in</a>";
	       // htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	    }
	htmlContent += "</ul>";
	$('#divVideo').html(htmlContent);
	});
} 

function searchWeb(){
	//var searchText= $("#searchWeb").val();
	textoABuscar = 'ashok';//$('#txtABuscar').val();
	var htmlContent="<ul>"; 
	$.getJSON('http://api.duckduckgo.com/?q=ashok&format=json&pretty=1&callback=?',function(data){
	//$.getJSON('https://api.duckduckgo.com/?q='+textoABuscar+'&t=ffsb&ia=web&callback=jsonp&format=json&pretty=1',function(data){
	    for (var i = 0; i < 3; i++) {
	  //  for (var i = 0; i < data.RelatedTopics.length;i++) {
	        var desc= data.RelatedTopics[i].Text;
	        var url= data.RelatedTopics[i].Icon.URL;
	        htmlContent +="<a href='" + url + "' class='list-group-item list-group-item-action'>Dapibus ac facilisis in</a>";
	        //htmlContent += "<li><img src='" + url + "' style='width:100px;height:100px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	    }
	htmlContent += "</ul>";
	$('#divWeb').html(htmlContent);
	});
} 

function searchApiGoogle(){
	  var service_url = 'https://kgsearch.googleapis.com/v1/entities:search';
	  var params = {
	    'query': 'Taylor Swift',
	    'limit': 10,
	    'indent': true,
	    'key' : 'AIzaSyB71yL3Jv5dvIROXKNcoy0_mvck0GZIiCM',
	  };
	  $.getJSON(service_url + '?callback=?', params, function(response) {
	    $.each(response.itemListElement, function(i, element) {
	      $('<div>', {text:element['result']['name']}).appendTo(document.body);
	    });
	  });	
	
}



function semanticSearch(){
	
	var cv="", ci="", cw="", ct="";
	
	if($("#chkVIDEO").is(':checked')){ cv=1;}
	if($("#chkIMG").is(':checked'))  { ci=2;}
	if($("#chkWEB").is(':checked'))  { cw=3;}	
	
	ct = cv+ci+cw;
	textoABuscar = $('#txtABuscar').val();
	
	if(ct==""){ alert("Debe seleccionar una opción");		
	}else if(ct=6){
		searchImagenes(textoABuscar);
		searchVideos(textoABuscar);
		searchWeb(textoABuscar);	
	}
}	

function selectChkTema() {
//https://api.jquery.com/checked-selector/
	
	var txts ="", id="" ;
	
	if($("#chk_0").is(':checked'))  {
		txts="Tabla de frecuencia y grafico de barras."; id=1;
		$('#idSesion').val(id);
		$('#txtABuscar').val(txts);
	}
	if($("#chk_1").is(':checked'))  { 
		txts="Medidas de tendencia central: moda";id=1;
		$('#idSesion').val(id);
		$('#txtABuscar').val(txts);	
	}
	if($("#chk_2").is(':checked'))  { 
		txts="Medidas de tendencia central: media aritmetica";id=2;
		$('#idSesion').val(id);
		$('#txtABuscar').val(txts);
	}	
	if($("#chk_3").is(':checked'))  {
		txts="Poblacion y muestra";id=3;
		$('#idSesion').val(id);
		$('#txtABuscar').val(txts);	
	}
	
	//alert("Checkbok "+txts)
	
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


/*function searchImagenes(){

textoABuscar = 'Barack Obama';//$('#txtABuscar').val();
//var txtVideo= $("#searchImg").val();
var htmlContent="<ul>"; 

$.ajax({
  type: 'GET',
  url: 'https://api.duckduckgo.com/',
  data: { q: textoABuscar, format: 'json', pretty: 1,iax:'images',ia:'images' },
  jsonpCallback: 'jsonp',
  dataType: 'jsonp'
}).then(function (data) {
	for (var i = 0; i < 5;i++) {
        var desc= data.RelatedTopics[i].Text;
        var url= data.RelatedTopics[i].Icon.URL;
        htmlContent +="<a href='" + url + "' class='list-group-item list-group-item-action'>Dapibus ac facilisis in</a>";
        //htmlContent += "<li><img src='" + url + "' style='width:30px;height:30px;display:inline-block'/> <p style='display:inline-block'>"+desc+"</p></li>";
	}		    	
  console.log(data);
});
htmlContent += "</ul>";
$('#divImg').html(htmlContent);
}*/