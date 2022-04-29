<%--
  Created by IntelliJ IDEA.
  User: a000
  Date: 2022/04/29
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 등록</title>
</head>
<body>
<form method='post' action='/addMember.do'>
    id : <input type='text' name='id'/><br>
    pwd : <input type='password' name='pwd'/><br>
    name : <input type='text' name='name'/><br>
    image : <input type='text' name='profileFileName'/><br>
    <input type='submit' value='등록'/>
</form>
</body>
</html>
