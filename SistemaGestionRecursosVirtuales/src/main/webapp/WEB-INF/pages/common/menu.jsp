<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Proyecto</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
	<div class="navbar-header">
      <a class="navbar-brand" href="#">
      	<span class="glyphicon glyphicon-globe"></span> GRV
  	  </a>
  	  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
	</div>
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	    <ul class="nav navbar-nav navbar-left">
	      <li>
	      	<a href="${pageContext.request.contextPath}/welcome">Bienvenido</a>
	      </li>
	      <li>
	      	<a href="${pageContext.request.contextPath}/home">Home</a>
	      </li>
<%-- 	      <li>
	      	<a href="${pageContext.request.contextPath}/userInfo">verPDF</a>
	      </li>
	      <li>
	      	<a href="${pageContext.request.contextPath}/admin">Admin</a>
	      </li>
	      <li>
	      	<a href="${pageContext.request.contextPath}/verPdf">Pdf</a>
	      </li> --%>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li>
	     	<c:if test="${pageContext.request.userPrincipal.name != null}">
	    		<a href="${pageContext.request.contextPath}/logout">
	    			<span class="glyphicon glyphicon-log-out"></span> Cerrar Sesión
	   			</a>
	  	 	</c:if>
	      </li>
	    </ul>
	</div>
  </div>
</nav>

</body>
</html>