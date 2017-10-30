<%@page session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>${title}</title>
</head>
<body>
	<jsp:include page="common/menu.jsp" />
    <h1>Message : ${message}</h1>
    
       <a href="${pageContext.request.contextPath}/Recursos">Recursos Virtuales</a>
       
</body>
</html>