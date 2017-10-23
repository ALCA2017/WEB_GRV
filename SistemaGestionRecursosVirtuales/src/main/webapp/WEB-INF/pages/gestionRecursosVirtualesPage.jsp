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
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	</head>
	<body>
	<!--
		<jsp:include page="common/menu.jsp" />
	-->
	
	<div class="container">
		<h1>List of Areas Académicas</h1>
	</div>
	<div class="container">
		<form action="" class="form-horizontal">
			
			<!-- Combo AÑO -->
			<div class="form-group">
			  <label class="label-control" for="exampleFormControlSelect1">Elige el Año:</label>
			  <select class="form-control" id="exampleFormControlSelect1">
				<c:forEach items="${anioAcademicosList}" var="aa">
					<option value="${aa.idAnioAcademico}">${aa.anio}</option>
				</c:forEach>
			  </select>
			  <button type="button" class="btn btn-outline-primary form-control">Buscar</button>
			</div>	
			
			<!-- Combo AREA -->
			<div class="form-group">
			  <label class="label-control" for="exampleFormControlSelect1">Elige el Área:</label>
			  <select class="form-control btn-block" id="exampleFormControlSelect1">
				<c:forEach items="${areasAcademicasList}" var="aa">
					<option value="${aa.idAreaAcademica}">${aa.nombreArea}</option>
				</c:forEach>
			  </select>
			  <button type="button" class="btn btn-outline-primary form-control">Listar</button>
			</div>	
			
			<!-- TABLA listado de Unidades de Aprendizaje -->
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">ID</th>
			      <th scope="col">NRO_UNIDAD</th>
			      <th scope="col">TITULO</th>
			      <th scope="col">ESTADO</th>
			      <th scope="col">ACTUALIZADO</th>
			    </tr>
			  </thead>
			  <tbody>
			    
			    <c:forEach items="${unidadDidacticasList}" var="aa">
					<tr>
						<th scope="row">${aa.idUnidadDidactica}</th>
						<td>${aa.nroUnidad}</td>
						<td>${aa.tituloUnidad}</td>
						<td>${aa.estado}</td>
						<td>${aa.fechaActualizado}</td>
				    </tr>
			    </c:forEach>
			      
			    
			  </tbody>
</table>

		</form>
	</div>

	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  </body>
</html>