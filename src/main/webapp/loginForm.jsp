<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset='UTF-8'/>
    <title>title 입니다.</title>
</head>
<body>
<form method='post' action='/login.do'>
    id : <input type='text' name='id'/><br>
    pwd : <input type='password' name='pwd'/><br>
    <input type='submit' value='로그인'/>
</form>
</body>
</html>


