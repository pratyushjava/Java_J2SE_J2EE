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
	<s:form action="complaint_added" namespace="/basic">
		<s:textfield name="name" label="Enter Name" />
		<s:textfield name="email" label="Enter Email" />
		<s:password name="password" label="Enter Password" />
		<s:doubleselect list="#application.states.keySet()"
			label="Choose Location" name="state" doubleName="city"
			doubleList="#application.states.get(top)" />
		<s:radio list="#application.browsers" label="Choose Browser"
			name="browser"></s:radio>
		<s:checkboxlist list="#application.technologies"
			label="Choose Technologies" name="techno" />
		<s:select list="#application.platforms" label="Choose Platform"
			name="os" />
		<s:textarea cols="40" rows="3" label="Enter Complaint Desc"
			name="desc" />
		<s:submit />
		<s:reset />
	</s:form>
</body>
</html>