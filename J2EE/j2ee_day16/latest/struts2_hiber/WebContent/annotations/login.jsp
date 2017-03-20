<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts login page</title>
</head>
<body>
<s:form action="login1">
<s:textfield name="uName" label="Your name"/>
<s:password name="uPass" label="Your Password"/>
<s:submit/>
</s:form>

</body>
</html>