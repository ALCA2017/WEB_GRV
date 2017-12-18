<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
	 	<title>Asignación de recursos virtuales a los temas de una unidad didáctica</title>	 	
		<!-- Required meta tags -->
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1.0, shrink-to-fit=no">
		
		<!-- Alert's -->		
		<script type="text/javascript" src="<c:url value='/bootstrap/sweetalert/lib/sweetalert.min.js'/> "></script>
		<link rel="stylesheet" type="text/css" href="<c:url value='/bootstrap/sweetalert/lib/sweetalert.css'/>"  />
		

		<!-- Cargar Combos -->
		<script type="text/javascript" src="<c:url value='/js/modulo/recursos_virtuales/recursos.js'/>"></script>
	
		<!-- PARA API YOUTUBE-->
		<script type="text/javascript" src="<c:url value='/js/semantic/api-youtube.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/semantic/api-web.js'/>"></script>
		
	    <link rel="stylesheet" type="text/css" href="<c:url value='/js/semantic/maincss.css'/>"  />
	    <link rel="stylesheet" type="text/css" href="<c:url value='/js/semantic/lib/pretty-json.css'/>" />	    
	    <!-- Latest compiled and minified CSS -->
	    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" > -->
	    <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css" >
	    <script src="http://code.jquery.com/jquery-2.1.4.js" type="text/javascript"></script>
	    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js" type="text/javascript"></script>
	    <!-- Underscore, backbone and pretty are used for displaying the json responce in user redable format -->
	    <script type="text/javascript" src="<c:url value='/js/semantic/lib/js/underscore-min.js'/> "></script>
	    <script type="text/javascript" src="<c:url value='/js/semantic/lib/js/backbone-min.js'/> "></script>
	    <script type="text/javascript" src="<c:url value='/js/semantic/lib/js/pretty-json-min.js'/> "></script>
		<!-- PARA API YOUTUBE-->
		
		<link rel="stylesheet" type="text/css" href="<c:url value='/css/grv.css'/>"  />
			
		<script type="text/javascript">
		
			$(document).ready(function(){
				limpiarListasSemanticas();
				CargarAreasAcademicasDelAnioSeleccionado();
				cargaUnidadesDelAreaSeleccionada();
				cargaTemasDeLaUnidadSeleccionada();
			    $("#formSelectAnios").on( "change", function( event ) {			    	
			    	limpiarListasSemanticas();			    	
			    	$("#list-temas").html('<li href="#" class="list-group-item title"> Temas de la Unidad</li>');
			    	document.getElementById("hyv-search").value = '';	
			    	$('#formSelectUnidades').empty().append($('<option>').text('Seleccionar...').attr('value',''));

			    });				
			    $("#hyv-searchBtn").on( "click", function( event ) {			    	
			        youtubeApiCall();
			        webApiCall();
			        imageApiCall();
			        document.getElementById("btnGuardarRecurso").disabled = false;
			        return false;
			    });	
	    
				   			    
			});
		
		</script>			

	</head>
	<body style="background-color:#314E7A;">
	
		<jsp:include page="common/menu.jsp" />
		<input type="hidden" id="idTemaSeleccionado" name="idTemaSeleccionado" >
			
			<div class="container">
			  
				<div class="row">
				  <div class="col-xs-12 col-sm-6 col-md-12">
				  	<div class="jumbotron_grv"><h3>Asignación de Recursos Virtuales</h3></div>
				  </div>
				</div>
					
				<div class="row">
				  <div class="col-xs-6-grv">
					  <div class="jumbotron_grv" style="height: 300px;">
					  <br>
				  		<label class="label-control">Año Escolar</label><BR>				  		
						<select  name="formSelectAnios" id="formSelectAnios">
							<c:forEach items="${aniosacademicoslist}" var="anio">
								<option id="${anio.idAnioAcademico}" value="${anio.idAnioAcademico}" >${anio.anio}</option>
							</c:forEach>
						</select>
						<BR><BR>
						<label class="label-control">Áreas Academicas</label><BR>
						<select name="formSelectAreas" id="formSelectAreas" >
						  <option>Seleccionar opción</option>
						</select>					
						<BR><BR>
						<label class="label-control">Unidades Academicas</label><BR>
						<select name="formSelectUnidades" id="formSelectUnidades" >
						  <option>Seleccionar opción</option>
						</select><br><br><br>
						<div class="form-group">
		                    <div class="col-md-10 col-md-offset-7">
		                        <button type="button" onclick="Cancel();" class="btn btn-danger" id="btn-cancelar">
		                            Cancelar
		                            <span class="glyphicon glyphicon-remove-sign"></span>
		                        </button>	
		                        <button  value="Guardar" class="btn btn-primary" id="btnGuardarRecurso" disabled="disabled" onclick="AsignarRecursosAlTema()">
		                            Guardar
		                            <span class="glyphicon glyphicon-chevron-right"></span>
		                        </button>
		                    </div>
		                </div>
					  </div>				
				  </div>				  
				  <div class="col-xs-6-grv">	  
				  	<div class="jumbotron_grv" style="height: 300px;">
						<ul class="list-group" id="list-temas"><li href="#" class="list-group-item title"> Temas de la Unidad</li></ul>
				  	</div>
				  </div>				  
				</div>
				
				<div id="busqueda_semantica" style="visibility: hidden;" >
						<div class="row">
							<div class="col-xs-12 col-sm-6 col-md-12">
								<div class="jumbotron_grv">
									<div class="container-4">	                        
										<input type="search" name="hyv-search" id="hyv-search" placeholder="Search..." class="ui-autocomplete-input" autocomplete="off">
										<button class="icon" id="hyv-searchBtn"></button>	                        
									</div>
								</div>
							</div>
						</div>	
						<div class="row">
							<div class="col-xs-6 col-md-4">
								<div id="hyv-watch-content" class="hyv-watch-main-col hyv-card hyv-card-has-padding">
								    <ul id="hyv-watch-related" class="hyv-video-list"></ul>
								</div>  				  
							</div>		
							<div class="col-xs-6 col-md-4">
								<div id="hyv-watch-content" class="hyv-watch-main-col hyv-card hyv-card-has-padding">
								    <ul id="hyv-see-related" class="hyv-video-list"></ul>
								</div>  				  
							</div>										
							<div class="col-xs-6 col-md-4">
								<div id="hyv-watch-content" class="hyv-watch-main-col hyv-card hyv-card-has-padding">
								    <ul id="hyv-read-related" class="hyv-video-list"></ul>
								</div>
							</div>			  
						</div>
				</div>  
			</div>
	
		
	<!-- FOOTER -->
	<jsp:include page="common/footer.jsp" />
  </body>
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
            border-radius: 6px
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
</html>