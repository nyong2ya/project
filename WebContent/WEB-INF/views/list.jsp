<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GuestBook List Page </title>
</head>
<body>

<h3>초간단 방명록 리스트 </h3>
<input type="button" value = "글쓰기" onclick="javascript:window.location.href='writeform.do'"><br><br>

<c:forEach items="${list }" var="list">
	${list.num }
	${list.name }
	${list.email }
	${list.home }
	${list.contents }<hr>
</c:forEach>
<a href="deleteform.do">글삭제</a>
</body>
</html>