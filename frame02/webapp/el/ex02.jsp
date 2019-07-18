<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String msg ="hello el";
		pageContext.setAttribute("msg", msg);
	%>
	<h1>동작</h1>
	<p>${pageScope.msg}</p>
	<p>${requestScope.msg}</p>
	<p>${sessionScope.msg}</p>
	<p>${applicationScope.msg}</p>
</body>
</html>