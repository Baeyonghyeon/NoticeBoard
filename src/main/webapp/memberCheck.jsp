<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: a000
  Date: 2022/04/29
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>회원 조회</title>
</head>
<body>
<a href="/">Go to main</a>
<table>
    <c:forEach var="member" items="${userRepository.getUsers()}">
        <tr>
            <td>아이디 : ${member.getId()}</td>
<%--            <td><input type="button" onclick="location.href='memberDetail?memberId=${member.getId()}'" value="목록보기"></td>--%>
<%--            <td><input type="button" value="수정하기" onclick="memberUpdate()"></td>--%>
<%--            <td><input type="button" onclick="window.open('delete?memberId=${member.getId()}','','status=no, height=150, width=400')" value="삭제하기"></td>--%>
        </tr>
    </c:forEach>

</table>
</body>
</html>
