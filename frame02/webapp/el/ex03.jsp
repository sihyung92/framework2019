<%@page import="com.bit.entity.JavaBean"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String[] list = {"ab","abc","abcd","abcde"}; 

	ArrayList<String> alist = new ArrayList<String>();
	alist.add("AB");
	alist.add("ABC");
	alist.add("ABCD");
	alist.add("ABCDE");
	
	HashSet<String> hset = new HashSet<String>();
	hset.add("a");
	hset.add("ab");
	hset.add("abc");
	hset.add("abcd");

	HashMap<String,String> hmap = new HashMap<String,String>();
	hmap.put("key1","val1");
	hmap.put("key2","val2");
	hmap.put("key3","val3");
	
	JavaBean bean = null;
	bean = new com.bit.entity.JavaBean();
	bean.setSu1(1234);
	bean.setSu2(3.14);
	bean.setCh('A');
	bean.setBoo(true);
	bean.setMsg("bean object");
	bean.setNalja(new java.util.Date());
	
	pageContext.setAttribute("list",hmap);
	pageContext.setAttribute("bean",bean);
	
%>
<body>
	<h1>자료 표현</h1>
	<dl>
		<dt>0</dt>
		<dd>${bean.su1}</dd>
	</dl>
	<dl>
		<dt>1</dt>
		<dd>${bean.su2}</dd>
	</dl>
	<dl>
		<dt>2</dt>
		<dd>${bean.ch}</dd>
	</dl>
	<dl>
		<dt>3</dt>
		<dd>${bean.boo}</dd>
	</dl>
</body>
</html>