<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
	 	
		<!-- Required meta tags -->
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1.0, shrink-to-fit=no">		

	    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" ></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" ></script>
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	
		<script type="text/javascript" src="<c:url value='/js/semantic/semantic_search.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/bootstrap/js/jquery-3.2.1.slim.min.js'/>"></script>
	
		
		<script type="text/javascript" src="<c:url value='/js/bootstrap/js/jquery-personalizado.js'/>"></script>
		<link rel="stylesheet" href="<c:url value='/js/bootstrap/css/bootstrap.min.css'/>" type="text/css" />
		<link rel="stylesheet" href="<c:url value='/js/bootstrap/css/estilos.css'/>" type="text/css" />
	
	<!-- PARA API YOUTUBE-->
	<script type="text/javascript" src="<c:url value='/js/semantic/api-youtube.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/js/semantic/api-web.js'/>"></script>
	
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/semantic/maincss.css'/>"  />
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/semantic/lib/pretty-json.css'/>" />
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" >
    <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css" >
    <script src="http://code.jquery.com/jquery-2.1.4.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js" type="text/javascript"></script>
    <!-- Underscore, backbone and pretty are used for displaying the json responce in user redable format -->
    <script type="text/javascript" src="<c:url value='/js/semantic/lib/js/underscore-min.js'/> "></script>
    <script type="text/javascript" src="<c:url value='/js/semantic/lib/js/backbone-min.js'/> "></script>
    <script type="text/javascript" src="<c:url value='/js/semantic/lib/js/pretty-json-min.js'/> "></script>
	<!-- PARA API YOUTUBE-->
	
			
<script type="text/javascript">
$(document).ready(function(){
	$("#formSelectAnios").change(function() {		
		var id = $("#formSelectAnios").val();
		var params = {idAnio:id };		
		console.log("Cargando las áreas academicas del año escolar	"+id)
	    $.ajax({
	    	type: 'GET',
	        url: 'http://localhost:8455/malla/areas/academicas?anioAcademico='+id, //'AreasAcademicas', /*desde controller no devuel*/
	        data: params,
	        dataType: 'json',	        
	        success: function (data) {
	       		$('#formSelectAreas').empty();       	
	        	$('#select').append($('<option>').text("Select"));
	        	$.each(data, function(i, obj) {	    
        	        $('#formSelectAreas').append($('<option>').
        	        		text(obj.nombreArea).attr('value',obj.idAreaAcademica));        	      
        	    });
	        },	        
	        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
	        	 //alert("Status: " + textStatus); alert("Error: " + errorThrown);
	        	 console.log("Status : "+textStatus );
	        	 console.log("Error : "+errorThrown );
	        },
	        complete : function() {
	        	// console.log("Complete Areas");
	       	}	        
	    });

		});	

$( "#formSelectAreas").change(function() {	
	var id = $("#formSelectAreas").val();
	var params = {idArea:id };		
	console.log("Cargando Unidades de las áreas"+id)
    $.ajax({
    	type: 'GET',
        url: 'http://localhost:8455/malla/unidades/didacticas?idAreaAcademica='+id,
        data: params,
        dataType: 'json',	        
        success: function (data) {
       		$('#formSelectUnidades').empty();       	
        	$('#select').append($('<option>').text("Select"));
        	$.each(data, function(i, obj) {	    
    	        $('#formSelectUnidades').append($('<option>').
    	        		text("Unidad "+obj.idUnidadDidactica +" - " +obj.tituloUnidad).attr('value',obj.idUnidadDidactica));        	      
    	    });
        },	        
        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
        	 //alert("Status: " + textStatus); alert("Error: " + errorThrown);
        	 console.log("Status : "+textStatus );
        	 console.log("Error : "+errorThrown );
        },
        complete : function() {
        	// console.log("Complete..." );
       	}	        
    });

	});
		
	$( "#formSelectUnidades").change(function() {
		var id = $("#formSelectUnidades").val();
		var params = {idUnidadDidactica:id };		
		
		    $.ajax({
		    	type: 'GET',
		        url: 'unidadesAcademicas/temas_recursos',
		        data: params,
		        dataType: 'json',	        
		        success: function (data) {        	
		    	    //$.each(data, function(i, obj) {	   
		  	    	$.each(data, function(i, item) {
		  	    	    $('<tr>').html("<td>" + data[i].campo_tematico + "</td><td>" 
		  	    	    					  + data[i].nroIMG + "</td><td>" 
		  	    	    					  + data[i].nroVIDEO + "</td><td>" 
		  	    	    					  + data[i].nroWEB + "</td><td>"
		  	    	    					  + " <input type='checkbox' name='chk_"+data[i].id_sesion+"' id='chk_"+[i]+"' onClick='selectChkTema()' /></td>").appendTo('#temas_table');
		  	    	});
		        },	        
		        error    : function(XMLHttpRequest, textStatus, errorThrown) {	        	
		        	 console.log("Status : "+textStatus );
		        	 console.log("Error : "+errorThrown );
		        },
		        complete : function() {
		        	// console.log("Complete..." );
		       	}	        
		    });
	
		});	

		$("#btnGuardarRecurso").click(GuardarRecursos);			
	
		$("#submitImg").click(searchImagenes);
		$("#submitVideo").click(searchVideos);
		$("#submitWeb").click(searchWeb);
		
		//$("#btnBuscarRecurso").click(semanticSearch);
		$("#submit").click(searchAPI);
		
		$(document).ready(function() {
		    $("#hyv-searchBtn").on( "click", function( event ) {
		    	webApiCall();
		        youtubeApiCall();
		        return false;
		    });
		});		
		
});


</script>	
    <style type="text/css">
        body{
            background-color: #efefef;
        }
        .container-4 input#hyv-search {
            width: 500px;
            height: 30px;
            border: 1px solid #c6c6c6;
            font-size: 10pt;
            float: left;
            padding-left: 15px;
            -webkit-border-top-left-radius: 5px;
            -webkit-border-bottom-left-radius: 5px;
            -moz-border-top-left-radius: 5px;
            -moz-border-bottom-left-radius: 5px;
            border-top-left-radius: 5px;
            border-bottom-left-radius: 5px;
        }
        .container-4 button.icon {
            height: 30px;
            background: #f0f0f0 url('js/semantic/images/searchicon.png') 10px 1px no-repeat;
            background-size: 24px;
            -webkit-border-top-right-radius: 5px;
            -webkit-border-bottom-right-radius: 5px;
            -moz-border-radius-topright: 5px;
            -moz-border-radius-bottomright: 5px;
            border-top-right-radius: 5px;
            border-bottom-right-radius: 5px;
            border: 1px solid #c6c6c6;
            width: 50px;
            margin-left: -44px;
            color: #4f5b66;
            font-size: 10pt;
        }
    </style>	
	</head>
	<body style="background-color: #314E7A;">
	<jsp:include page="common/menu.jsp" />
	 <input type="hidden" id="idSesion" name="idSesion" >
	 <input type="hidden" id="txtABuscar" name="txtABuscar">

	<br>
	<form:form method="GET" action="" class="form-horizontal">
		<div class="container">
			<h2 class="label-control center">Recursos temas de una Unidad Didáctica</h2>
			
			<div class="row bordeado">
				<div class="form-group col-xs-12 col-sm-6 col-md-6 col-lg-6">
					<label class="label-control">
						Año Escolar:
					</label>
					<select  name="formSelectAnios" id="formSelectAnios" ">
						<c:forEach items="${aniosacademicoslist}" var="anio">
							<option id="${anio.idAnioAcademico}" value="${anio.idAnioAcademico}" >${anio.anio}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row bordeado">
				<div class="form-group col-xs-12 col-sm-6 col-md-6 col-lg-6">
					<label class="label-control">
						Áreas Academicas:
					</label>
					<select name="formSelectAreas" id="formSelectAreas" >
					  <option>Selecciona Área</option>
					</select>
				</div>
			
				<div class="form-group col-xs-12 col-sm-6 col-md-6 col-lg-6">
					<label class="label-control">
						Unidades de áreas academicas:
					</label>
					<select name="formSelectUnidades" id="formSelectUnidades" >
					  <option>Seleccionar Unidad</option>
					</select>
				</div>
			</div>
		</div>
		<br>
		<!-- TABLA -->		
		<div class="container">
			<h3> TEMAS </h3>
			<table class="table table-hover text-white" id="temas_table">
<!-- 		<table class="table" id="temas_table" class="tbtTemas"> -->
			  <thead class="thead-dark">
				<tr>
				  <th scope="col">Temas de la Unidad</th>
				  <th scope="col">Recursos Video</th>
				  <th scope="col">Recursos Imagen</th>
				  <th scope="col">Recursos Web</th>
				  <th scope="col"> + </th>            
				</tr>
			  </thead>
			  <tbody class="table-hover">
			  </tbody>
			</table>
		</div>
		
	</form:form>
	<br>	

	<!-- LISTAS -->
			<div class="container">
				<div class="row">
					<!-- <div class="form-group col-xs-12 col-md-6 ">
						<button type="button" class="btn btn-primary form-control" id="submitVideo">
						<span class="glyphicon glyphicon-star"></span>VIDEOS</button>
						<div id="divVideo">
		    				<img class="list-group-item list-group-item-action" id="img"  src="http://cdn.makeuseof.com/wp-content/uploads/2010/04/DuckDuckGo.png" style="width:100px;height:100px;">
						</div>
					</div> -->
		
                    <div class="container-4">
                        <form action="" method="post" name="hyv-yt-search" id="hyv-yt-search">
                            <input type="search" name="hyv-search" id="hyv-search" placeholder="Search..." class="ui-autocomplete-input" autocomplete="off">
                            <button class="icon" id="hyv-searchBtn"></button>
                        </form>
                    </div>
                    <div id="hyv-watch-content" class="hyv-watch-main-col hyv-card hyv-card-has-padding">
                        <ul id="hyv-read-related" class="hyv-video-list">
                        </ul>
                    </div>
                    
                    
                    <br><br>

                     <div id="hyv-watch-content" class="hyv-watch-main-col hyv-card hyv-card-has-padding">
                        <ul id="hyv-watch-related" class="hyv-video-list">
                        </ul>
                    </div>                   
                        		
					<div class="form-group col-xs-12 col-md-6 ">
						<button type="button" class="btn btn-primary form-control" id="submitImg">IMAGENES</button>
						<div id="divImg">
		    				<img class="list-group-item list-group-item-action" id="img"  src="http://cdn.makeuseof.com/wp-content/uploads/2010/04/DuckDuckGo.png" style="width:100px;height:100px;">
						</div>
					</div>
		
					<div class="form-group col-xs-12 col-md-6 ">
						<button type="button" class="btn btn-primary form-control" id="submitWeb">WEB's</button>
						<div id="divWeb">
		    				<img class="list-group-item list-group-item-action" id="img"  src="http://cdn.makeuseof.com/wp-content/uploads/2010/04/DuckDuckGo.png" style="width:100px;height:100px;">
						</div>
					</div>
					
					<div class="form-group col-xs-12 col-md-6 ">
						  <button id="btnGuardarRecurso" class="btn btn-primary btn-lg col-xs-12 col-lg-12">GUARDAR</button>
				  	</div>
				</div>
				
			</div>

		
	<!-- FOOTER -->
	<jsp:include page="common/footer.jsp" />
  </body>
</html>