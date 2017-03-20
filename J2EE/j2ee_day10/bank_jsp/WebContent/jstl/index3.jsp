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
Age : <input type="text" name="f2"/><br/>
Addr : <input type="text" name="f3"/><br/>
<input type="submit" name="f4" value="Login">
</form>
<c:if test="${param.f4 == 'Login'}">
Hello , ${param.f1} <br/>

<c:url var="url" value='next1.jsp'/>
<c:redirect url="${url}" >
<c:param name="p1" value="${param.f1}"/>
<c:param name="p2" value="${param.f2}"/>
<c:param name="p3" value="${param.f3}"/>
</c:redirect>
 

</c:if>
</body>
</html>