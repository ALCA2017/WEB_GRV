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
		  	    	    $('<tr>').html("<td>" + data[i].campo_tematico + "</td><td>" + data[i].nroIMG + "</td><td>" + data[i].nroVIDEO + "</td>" + "</td><td>" + data[i].nroWEB + "</td>").appendTo('#temas_table');
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
	
	
	
});


</script>	
	
	</head>
	<body>
	<jsp:include page="common/menu.jsp" />

	<div class="container">
		<h2>Asignar Recursos a los temas de una Unidad Didactica</h2>
	</div>
	<br>
	
	<div class="container">
	
		<form:form method="GET" action="/Recursos/BuscarRecursos" class="form-horizontal">
       
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
	            </tr>
	        </table>
		</div>
		
		<div id="SemanticSearch">
	      <div class="radio icheck-sunflower">
	          <input type="radio" id="sunflower1" name="sunflower" />
	          <label for="sunflower1">Buscar Video</label>
	      </div>
	      <div class="radio icheck-sunflower">
	          <input type="radio" id="sunflower1" name="sunflower" />
	          <label for="sunflower1">Buscar Imagen</label>
	      </div>
	      <div class="radio icheck-sunflower">
	          <input type="radio" id="sunflower1" name="sunflower" />
	          <label for="sunflower1">Buscar Web</label>
	      </div>                                        
		</div>	
	
	    <br>
		<div class="row" id="RecursosEncontradosPorSemantica">
			<div class="divVideo">
			   <img id="img"  src="https://professor-falken.com/wp-content/uploads/2017/10/arbol-tronco-musco-humedad-bosque-raices-Fondos-de-Pantalla-HD-professor-falken.com_.jpg"  style="width:200px;height:200px;">
			   <p id="p1">  </p>  
			</div>
			<div class="divImg">
			   <img id="img"  src="https://professor-falken.com/wp-content/uploads/2017/10/arbol-tronco-musco-humedad-bosque-raices-Fondos-de-Pantalla-HD-professor-falken.com_.jpg"  style="width:200px;height:200px;">
				    <p id="p2">  </p>
			</div>
			  <div class="divWeb">
				    <img id="img"  src="https://professor-falken.com/wp-content/uploads/2017/10/arbol-tronco-musco-humedad-bosque-raices-Fondos-de-Pantalla-HD-professor-falken.com_.jpg"  style="width:200px;height:200px;">
				    <p id="p3">  </p>
			</div>
		</div>		
			
		<button id="btnGuardarRecurso" >GUARDAR</button>    

		</form:form>
	</div>
		


  </body>
</html>