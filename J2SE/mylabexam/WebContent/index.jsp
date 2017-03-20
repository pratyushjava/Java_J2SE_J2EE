<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="cyan">
<form >
<center><h1>welcome to online voting</h1></center>
<table>

<tr><td>enter email<td><input type="text" name="email">
<tr><td>enter password<td><input type="password" name="password">
<tr><td><td><input type="submit" value="login" name="cmd">
</table>
</form>
<c:if test="${param.cmd=='login' }">

<jsp:useBean id="user2" class="Beans.UserBean" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user2"/>
<jsp:forward page="${user2.valid }.jsp"></jsp:forward>

</c:if>

</body>
</html>