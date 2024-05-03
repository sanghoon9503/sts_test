<%-- 한글 깨짐 방지 코드 삽입 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <%@ page session="false" %> --%>

<html>
<head>
	<title>Home</title>
	
	<%-- 한글 깨짐 방지 코드 삽입 --%>
	<meta charset="UTF-8">
</head>
<body>
<h1>
	Hello world!  
</h1>

	<a href = "add">add</a><br/>
	<a href = "add3">add3</a><br/>
	<a href = "add2Form">add2Form</a><br/>
	<a href = "add3Form">add3Form</a><br/>
	
	<hr/>
	<a href = "ex1?name=hong&age=20">문자열과 수치 전달 /ex1</a><br/>
	<a href = "ex2?name=hong&age=20">문자열과 수치 전달 /ex2</a><br/>
	<a href = "ex2">문자열과 수치 기본값 처리 /ex2</a><br/>
	<a href = "ex3?dueDate=2024-05-02">날짜전달</a><br/>	
	<a href = "ex3">Checked 값 전달</a><br/>
	<a href = "ex2">Checked 값 전달 하지 않음</a><br/>
	
<P>  The time on the server is ${serverTime}. </P>


<h1>${helloWorld}</h1>
</body>
</html>
