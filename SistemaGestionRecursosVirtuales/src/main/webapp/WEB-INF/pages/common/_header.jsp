<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Menu</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="../styles/estilos_menu.css">
</head>
<body>
	<div class="example3">
		<nav class="navbar navbar-inverse navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar3">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand">
						<span class="glyphicon glyphicon-globe"></span> GRV
					</a>
				</div>
					<div id="navbar3" class="navbar-collapse collapse">
			  			<ul class="nav navbar-nav navbar-right">
						    <li class="active">
						    	<a href="${pageContext.request.contextPath}/home">Home</a>
					    	</li>
						    <li>
						    	<a href="${pageContext.request.contextPath}/welcome">Bienvenido</a>
					    	</li>
						    <li>
						    	<a href="${pageContext.request.contextPath}/admin">Admin</a>
					    	</li>
						    <li>
						    	<a href="${pageContext.request.contextPath}/userInfo">User Info</a>
					    	</li>
						    <li>
						    	<a href="#">About</a>
					    	</li>
						    <li>
						    	<a href="#">Contact</a>
					    	</li>
						    <li class="dropdown">
					      		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li class="dropdown-header">Nav header</li>
									<li><a href="#">Separated link</a></li>
									<li><a href="#">One more separated link</a></li>
								</ul>
						    </li>
							<li class="active">
								<c:if test="${pageContext.request.userPrincipal.name != null}">
									<a href="${pageContext.request.contextPath}/logout">
										<span class="glyphicon glyphicon-log-out"></span> Logout
									</a>
								</c:if>
							</li>
				  		</ul>
					</div>
			  <!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>
	</div>
</body>
</html>