<!-- MENU -->
<div class="container-fluid">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
			<a class="navbar-brand" href="#">GRV</a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item">
					<a class="nav-link" href="${pageContext.request.contextPath}/welcome">Bienvenido</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${pageContext.request.contextPath}/home">Home</a>
				</li>
<%--				<li class="nav-item">
					<a class="nav-link" href="${pageContext.request.contextPath}/userInfo">verPDF</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${pageContext.request.contextPath}/admin">Admin</a>
				</li>
 				<li class="nav-item">
					<a class="nav-link" href="${pageContext.request.contextPath}/verPdf">Pdf</a>
				</li> --%>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<li>
					<c:if test="${pageContext.request.userPrincipal.name != null}">
						<a class="btn btn-outline-danger my-2 my-sm-0" href="${pageContext.request.contextPath}/logout">
						<span class="glyphicon glyphicon-log-out"></span> Cerrar Sesión
					</a>
				</c:if>
				</li>
			</form>
	  </div>
	</nav>
  
</div>
