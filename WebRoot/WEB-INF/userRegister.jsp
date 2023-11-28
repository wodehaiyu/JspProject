<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー新規</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/userRegister" method="post">
		<input type="text" name="studentnum">${message}<br>
		<input type="text" name="username"><br>
		<input type="password" name="password"><br>
		<input type="submit" value="登録">
	</form>
</body>
</html>