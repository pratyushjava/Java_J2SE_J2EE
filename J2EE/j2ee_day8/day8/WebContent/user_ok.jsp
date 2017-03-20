<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="user" class="beans.UserBean" scope="session" />
<body>
	<h3>
		Hello (via getP) ,
		<jsp:getProperty name="user" property="email" /></h3>
<h3>
		Hello (via EL) , ${sessionScope.user.email} </h3>
		<h3>Current Subscription ${user.subAmt}</h3>
		<a href="logout.jsp">Logout</a>
</body>
</html>