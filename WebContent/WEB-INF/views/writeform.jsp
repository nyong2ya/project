<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GuestBook Write Page </title>
</head>
<body>
<h1>방명록 글쓰기</h1>

<form action="./write.do" method="post">
	이름 :<input type="text" name="name"><br>
	번호:<input type="password" name="pwd"><br>
	이메일 :<input type="email" name="email"><br>
	홈페이지 :<input type="text" name="home"><br>
	내용 :<input type="text" name="contents"><br>
	<input type="submit" value="글쓰기"> &nbsp;&nbsp;&nbsp;&nbsp;
	<input type="reset" value="취소"> &nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="리스트보기" onclick="javascript.window.location.href='list.do'">
</form>
</body>
</html>