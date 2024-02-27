<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css" >
<title>MyPage</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h3>마이페이지</h3>
	<hr>
	<h4>
		<a href="<%= request.getContextPath() %>">HOME</a>
	</h4>
	<h4>
		<a href="./">./</a>
	</h4>
	<h4>
		<a href="../">../</a>
	</h4>
	<h4>
		<a href="../index.jsp">index</a>
	</h4>
	<h4>
		<a href="/jsp2_mvc">/jsp2_mvc/</a>
	</h4>
</body>
</html>