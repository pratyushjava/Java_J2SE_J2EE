<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h3>Welcome 2 Struts.....</h3></center>
<%--  Adding Business Action class returning success always & then changed to simple hardcoded checking  --%>
<a href="login.jsp">Simple Login</a><br/>
<%--Register User example to show auto conversion from String to Date --%>
<a href="register.jsp">Register User </a><br/>
<%--  HM based User info retrieval --  uses Ctx listener , Model Driven , Context Aware i/f  --%>
<a href="user.jsp">Get User Info</a><br/>
<%--Customer care Center -- to demo struts UI tags --%>
<a href="welcome_customer_care.jsp">Launch Customer Care Application</a>
</body>
</html>