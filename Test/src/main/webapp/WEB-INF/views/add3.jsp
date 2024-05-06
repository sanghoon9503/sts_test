<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add 입니다</title>
</head>
<body>

<form action="add3" method="post">
<label for="a"> A = </label>
	<input id="a" name="a" type="number" value="10" required="required"><br/>
<label for="b"> B = </label>
	<input id="b" name="b" type="number" value="20" required="required"><br/>
<input type="submit" value="계산">
</form>
<h1>${param.a} + ${param.b} = ${result}</h1>
<h1>${addVO.a} + ${addVO.b} = ${addVO.result}</h1>
</body>
</html>