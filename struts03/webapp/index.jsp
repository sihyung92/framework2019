<%@page import="com.bit.model.Struts03Dto"%>
<%@page import="com.bit.model.Struts03Dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<thead>
			<tr>
				<th>글번호
				<th>
				<th>제목</th>
			</tr>
		</thead>
		<tbody>
			<%
      ArrayList<Struts03Dto> list = (ArrayList<Struts03Dto>)request.getAttribute("list");
      for(Struts03Dto bean:list){
      %>
			<tr>
				<td><%=bean.getNum() %></td>
				<td><%=bean.getSub() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>