<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>Login Here</b>
<s:form action="PassangerHome.action">
<s:textfield name="emailid" label="enter your email id"/>
<s:password name="password" label="enter your password"></s:password>
<s:submit name="cmd" value="Login"/>

</s:form>
<table>
<tr height="200">

</table>
</body>
</html>