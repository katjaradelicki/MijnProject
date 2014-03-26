<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.servletContext.contextPath}" var="contextPath" />
<!DOCTYPE html >
<html>
<head>

<title>Welkom</title>
</head>
<body>
<c:set value="oeioei" var="aiai" />
-${aiai}-
<c:url value="/resultaat.htm" var="resultaatUrl"/>
<a href="${resultaatUrl}">resultaat</a>
</body>
</html>