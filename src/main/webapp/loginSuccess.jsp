   <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%--<fmt:setLocale value="${lang}" />--%>
<%--<fmt:setBundle basename="messages" var="message" />--%>
<html>
<head>
    <meta charset='UTF-8' />
<%--    <title><fmt:message key="login" bundle="${message}" /></title>--%>
    <title>${id}님 안녕하세요</title>
</head>
<body>
<%--    <fmt:message key="login" bundle="${message}" /> <fmt:message key="success" bundle="${message}" /><br />--%>
    id: ${id} 님 안녕하세요
    <br>
<%--    <a href="/logout.do"><fmt:message key="logout" bundle="${message}" /></a><br />--%>
<%--    <br>--%>

    <a href="/">Go to main</a>
<%--관리자는 아래 버튼이 보여야 한다.--%>
    <a href="/addMember.do">회원 추가</a>
</body>
</html>
