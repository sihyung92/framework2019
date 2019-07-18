<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL 표현식 (Expression Language)</h1>
	<table>
		<tr>
			<th>출력</th>
			<th>Java</th>
			<th>EL</th>
		</tr>
		<tr>
			<td>String</td>
			<td><%="abcd"+"cdef"%></td>
			<td>${"abcd"}</td>
		</tr>
		<tr>
			<td>숫자(정수)</td>
			<td><%=5/2%></td>
			<td>${5/2}</td>
		</tr>
		<tr>
			<td>실수</td>
			<td><%=3.14%></td>
			<td>${3.14}</td>
		</tr>
		<tr>
			<td>실수(연산)</td>
			<td><%=3.000000000001-1.0000000000009%></td>
			<td>${3.000000000001-1.0000000000009}</td>
		</tr>
		<tr>
			<td>boolean</td>
			<td><%=2==3%></td>
			<td>${2==3}</td>
		</tr>
		<tr>
			<td>boolean</td>
			<td><%=2==3%></td>
			<td>${2 eq 3}</td>
		</tr>
		<tr>
			<td>boolean</td>
			<td><%=2>3%></td>
			<td>${2 gt 3}</td>
		</tr>
		<tr>
			<td>boolean</td>
			<td><%=2<3%></td>
			<td>${2 lt 3}</td>
		</tr>
		<tr>
			<td>boolean</td>
			<td><%=2>=3%></td>
			<td>${2 ge 3}</td>
		</tr>
		<tr>
			<td>boolean</td>
			<td><%=2<=3%></td>
			<td>${2 le 3}</td>
		</tr>
		<tr>
			<td>null</td>
			<td><%
			String msg = null;
			out.print(msg);
			%>
			</td>
			<td>${msg}</td>
		</tr>
	</table>
</body>
</html>