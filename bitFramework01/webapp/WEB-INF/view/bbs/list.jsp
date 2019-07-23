<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<h1 class="display-4">리스트페이지<span class="badge badge-pill badge-primary">:)</span></h1>
	<table class="table table-striped">
		<tr>
			<th scope="co1">글번호</th>
			<th scope="co1">제목</th>
			<th scope="co1">글쓴이</th>
			<th scope="co1">날짜</th>
		</tr>
		<c:forEach items="${alist}" var ="bean">
		<tr>
			<td scope="row"><a href="detail.bit?idx=${bean.num}" class="nav-link">${bean.num }</a></td>
			<td><a href="detail.bit?idx=${bean.num}" class="nav-link">${bean.sub }</a></td>
			<td><a href="detail.bit?idx=${bean.num}" class="nav-link">${bean.name }</a></td>
			<td><a href="detail.bit?idx=${bean.num}" class="nav-link">${bean.nalja }</a></td>
		</tr>
		</c:forEach>
	</table>
	<a class="nav-link" href="add.bit">글쓰기</a>
</body>
</html>