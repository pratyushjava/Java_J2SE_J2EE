<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
User Name <input type="text" name="f1"/><br/>
<input type="submit" name="f2" value="Login">
</form>
<c:if test="${param.f2 == 'Login'}">
Hello , ${param.f1} <br/>
<c:set   scope="session"  var="attr1" value="${param.f1} "/>
</c:if>
<c:url var="dest_url" value="next.jsp"/>
<a href="${dest_url}">Next</a> 
</body>
</html>