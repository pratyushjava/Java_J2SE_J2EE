<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>From Display page</title>
</head>
<body>
<h3>
User Info Via JSP Expr <%= session.getAttribute("user_data") %></h3>
<h3>User Info Via EL Syntax ${sessionScope.user_data}
</h3>
<h3>Attr value ${attr1}</h3>
<h3>Attr value ${attr2}</h3>
</body>
</html>