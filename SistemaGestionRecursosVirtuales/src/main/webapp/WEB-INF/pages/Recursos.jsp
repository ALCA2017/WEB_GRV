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
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">

		<!-- Optional JavaScript -->
	    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
	    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" ></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" ></script>
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	
		<script type="text/javascript" src="<c:url value='/js/semantic/semantic_search.js'/>"></script>
	
		<script type="text/javascript" src="<c:url value='/js/bootstrap/js/jquery-personalizado.js'/>"></script>
		<link rel="stylesheet" href="<c:url value='/js/bootstrap/css/bootstrap.min.css' />" type="text/css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous"/>
		<link rel="stylesheet" href="<c:url value='/js/bootstrap/css/estilos.css'/>" type="text/css" />
			
<script type="text/javascript">
$(document).ready(function(){
	$( "#formSelectAnios").change(function() {		
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

		$( "#btnGuardarRecurso").click(function() {
			var id = $("#formSelectUnidades").val();
			var params = {
					idUnidadDidactica:id,
					idUnidadDidactica:id,
					idUnidadDidactica:id
					};		

			
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
		    
	
		$("#submitImg").click(searchImagenes);
		$("#submitVideo").click(searchVideos);
		$("#submitWeb").click(searchWeb);
		
		//$("#btnBuscarRecurso").click(semanticSearch);
		$("#submit").click(searchAPI);
});


</script>	
	
	</head>
	<body>
	<jsp:include page="common/menu.jsp" />
	 <input type="hidden" id="idSesion" name="idSesion" >
	 <input type="hidden" id="txtABuscar" name="txtABuscar">
	<div class="container">
		<h2>Asignar Recursos a los temas de una Unidad Didactica</h2>
	</div>
	<br>
	
	<div class="container">
	
		<form:form method="GET" action="" class="form-horizontal">
       
					<!-- Combo AÑO -->
			<div class="form-group">
			  <label class="label-control" for="formSelectAnios">Año Académico:</label>
			  <select class="selectpicker" name="formSelectAnios" id="formSelectAnios" class="form-control" style="width:200px">
				<c:forEach items="${aniosacademicoslist}" var="anio">
					<option id="${anio.idAnioAcademico}" value="${anio.idAnioAcademico}" >${anio.anio}</option>
				</c:forEach>
			  </select>			
			</div>
			
			<!-- Combo AREA -->						
			<div class="form-group">
			  <label class="label-control" for="formSelectAreas">Área Academica:</label>
			 <select class="selectpicker" name="formSelectAreas" id="formSelectAreas" style="width:200px">
				 <option>Selecciona Área</option>
			  </select>
			</div>	
			
			<div class="form-group">
			  <label class="label-control" for="formSelectUnidades">Unidades:</label>
			 <select class="selectpicker" name="formSelectUnidades" id="formSelectUnidades" style="width:400px">
				 <option>Seleccionar Unidad</option>
			  </select>
			</div>				

		<div id="Temas">		
			<table class="table" id="temas_table" class="tbtTemas">
	            <tr>	            	
	                <th>Temas de la Unidad</th>
	                <th>Recursos Video</th>
	                <th>Recursos Imagen</th>
	                <th>Recursos Web</th>	 
	                <th> + </th>               
	            </tr>
	        </table>
		</div>

		</form:form>		

		<div id="SemanticSearch">		

			<div class="container">
				<div class="row">
					<div class="form-group col-xs-12 col-md-6 col-lg-4">
	 					<!-- <input  name="chkVIDEO" id="chkVIDEO" type="checkbox" onclick="searchVideos()" class="form-check-input">Video</label> -->
	 					<br>
	 					<button id="submitVideo">buscar</button>
	 					<br>	
						<div id="divVideo">
			    			<img id="img"  src="http://cdn.makeuseof.com/wp-content/uploads/2010/04/DuckDuckGo.png" style="width:100px;height:100px;">						
						</div>
					</div>
	
					<div class="form-group col-xs-12 col-md-6 col-lg-4">
						<!-- <input name="chkIMG" id="chkIMG" type="checkbox" onclick="searchImagenes()" class="form-check-input">Imagen</label>	 -->
						 <br>
	 						<button id="submitImg">buscar</button>
	 					<br>	
						<div id="divImg" >
						    <img id="img" src="http://cdn.makeuseof.com/wp-content/uploads/2010/04/DuckDuckGo.png" style="width:100px;height:100px;">					
						</div>
					</div>
	
					<div class="form-group col-xs-12 col-md-6 col-lg-4">
						<!-- <input name="chkWEB" id="chkWEB" type="checkbox" onclick="searchWeb()" class="form-check-input">Web</label> -->
						 <br>
	 					<button id="submitWeb">Web</button>
	 					<br>
						<div id="divWeb" class="">
							<img id="img"  src="http://cdn.makeuseof.com/wp-content/uploads/2010/04/DuckDuckGo.png"  style="width:100px;height:100px;">
						</div>
					</div>
					
					<div class="form-group col-xs-12 col-md-6 col-lg-4">
						  <button  id="btnGuardarRecurso" class="btn btn-danger col-xs-12 col-lg-12">GUARDAR</button>
				  	</div>
				</div>				
			</div>				 	 		 
		</div>			
  
	</div>
		
  </body>
</html>