<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Error Message 
<font color="red">
${pageContext.exception.message}
</font><br/>
URI ${pageContext.errorData.requestURI}<br/>
Root Cause ${pageContext.exception.cause}<br/>


</body>
</html>