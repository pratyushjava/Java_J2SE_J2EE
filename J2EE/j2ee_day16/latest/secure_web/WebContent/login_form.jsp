
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<c:url var="url" value="j_security_check" />
<center>
<form name="f1" action="${url}" method="POST">
    Enter Name <input type="text" name="j_username" value="" /> <br/>
    Enter Password<input type="password" name="j_password" value="" /><br/> 
    <input type="submit" value="Authenticate" /></form>
</center>
</body>
</html>
