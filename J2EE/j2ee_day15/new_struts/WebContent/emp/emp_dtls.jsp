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
	<h3>Emp Details</h3>
	<table border="1">
		<tr>
			<th>Emp Name</th>
			<th>Dept ID</th>
			<th>Salary</th>
		</tr>
		<s:iterator var="emp" value="empList">
			<tr>
				<td><s:property value="name" /></td>
				<td><s:property value="deptId" /></td>
				<td><s:property value="sal" /></td>
			</tr>
		</s:iterator>
	</table>
	<a href="welcome_emp.jsp">Back To Main Emp Page</a>
</body>
</html>