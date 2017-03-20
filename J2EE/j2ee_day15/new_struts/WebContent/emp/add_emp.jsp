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
<s:form action="add_emp" namespace="/emp">
<s:textfield name="name" key="user.input.username"/>
<s:textfield name="deptId" key="user.input.dept"/>
<s:textfield name="sal" key="user.input.sal"/>
<s:submit/>
</s:form>
</body>
</html>