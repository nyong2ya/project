<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deleteform.jsp </title>
</head>
<body>
<h1>글 삭제 페이지</h1>
<form action = "./delete.do" method="post">
	번호입력 : <input type="text" name="num"><br>
	<input type="submit" value="삭제">
</form>
</body>
</html>