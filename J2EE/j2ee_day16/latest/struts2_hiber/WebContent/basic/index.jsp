<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Contact Manager - Struts2 Hibernate Example</title>
</head>
<s:head/>
<body>

<h1>Contact Manager</h1>


<s:form action="add">
	<s:textfield name="firstName" label="Firstname" required="true"/>
	<s:textfield name="lastName" label="Lastname"/>
	<s:textfield name="emailId" label="Email"/>
	<s:textfield name="cellNo" label="Cell No."/>
	<s:textfield name="website" label="Homepage"/>
	<s:textfield name="birthDate" label="Birthdate"/>
	<s:submit value="Add Contact" align="center"/>
</s:form>


<h2>Contacts</h2>
<table id="contact" border="1">
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Cell No.</th>
	<th>Birthdate</th>
	<th>Homepage</th>
	<th>Delete</th>
</tr>

<s:iterator value="contactList" id="contact">
	<tr>
		<td><s:property value="lastName"/>, <s:property value="firstName"/> </td>
		<td><s:property value="emailId"/></td>
		<td><s:property value="cellNo"/></td>
		<td><s:property  value="birthDate" /></td>
		
		<td><s:property value='website'/></td>
		<td><a href="delete.action?id=<s:property value='id'/>">delete</a></td>
	</tr>	
</s:iterator>
</table>
</body>
</html>