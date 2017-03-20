<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center">
<form>
<tr><td><a href="Destination.action?r=d" name="link"  >Delhi</a>
<tr><td><a href="Destination.action?r=p" name="link" >Pune</a>
<tr><td><a href="Destination.action?r=k" name="link" >Kanpur</a>
<tr><td><a href="Destination.action?r=j" name="link" >Jaipur</a>
<tr height="100">


</table>
<c:if test="${param.r=='d' }">
delhi details
</c:if>

<c:if test="${param.r=='p' }">
pune details
</c:if>

<c:if test="${param.r=='k' }">
kanpur details
</c:if>

<c:if test="${param.r=='j' }">
jaipur details
</c:if>

</form>

</body>
</html>