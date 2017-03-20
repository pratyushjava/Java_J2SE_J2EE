<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:head theme="xhtml"/>
<s:form action="register" namespace="/locale" >
<s:textfield name="email" label="Enter Email"/>
<s:password name="password" label="Enter Password"/>
<s:textfield name="dob" label="Enter DOB(mm/dd/yyyy)"/>
<s:submit/>
</s:form>
</body>
</html>