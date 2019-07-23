<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h1 class="display-4">입력 페이지</h1>
	<form action ="insert.bit">
		<div class="form-group">
			<label for="sub">제목</label>
			<input type="text" class="form-control"  name="sub" id="sub"/>
		</div>
		<div class="form-group">
			<label for="name">글쓴이</label>
			<input type="text" class="form-control"  name="name" id="name"/>
		</div>
		<div class="form-group">
			<textarea class="form-control"  rows="" cols="" name="content"></textarea>
		</div>
		<div class="form-group">
			<button class="btn btn-primary" type="submit">입력</button>
			<button class="btn btn-danger" type="reset">취소</button>
			<button class="btn btn-secondary" type="button" onclick="history.back();">뒤로</button>
		</div>
	</form>
</body>
</html>