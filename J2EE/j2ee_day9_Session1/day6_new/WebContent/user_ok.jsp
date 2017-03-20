<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="user" class="beans.UserBean" scope="request"/>
<body>
<h3>User Validated succesfully....</h3>
User Email --- <jsp:getProperty property="email" name="user"/><br/>
Via EL ---User Email ---${user.email}
Via Rq. param --- -User Email ---${param.email}<br/>
Entrie User Dtls ---${user.myUser}






</body>
</html>