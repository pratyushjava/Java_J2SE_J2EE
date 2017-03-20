<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="create_ac" namespace="/bank">
		<s:textfield name="type" label="Account Type" />
		<s:textfield name="bal" label="Initial Balance" />
		<s:textfield name="creationDate" label="Creation Date(MM/dd/YYYY)" />
		<s:submit value="Create A/C" />
	</s:form>
</body>
</html>