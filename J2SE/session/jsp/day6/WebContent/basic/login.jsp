<%@page import="pojos.UserPOJO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%!
    //page scope var -- private d.m 
    HashMap<String, UserPOJO> users;

	public void jspInit() {
		users = new HashMap<String, UserPOJO>();
		users.put("a@b", new UserPOJO("a@b", "123", 100));
		users.put("c@b", new UserPOJO("c@b", "1234", 200));
		users.put("d@b", new UserPOJO("d@b", "12345", 300));

	}%>
<%!public void jspDestroy() {
		users = null;
	}%>
<body>
	<%
		String email = request.getParameter("email");
		String pass1 = request.getParameter("pass");
		if (users.containsKey(email))
			if (users.get(email).getPassword().equals(pass1))
		{
			UserPOJO u = users.get(email);
	%>
	<h3>
		Login Succesful . Your Details <br/>
		<%= u %>
	</h3>
	<%
		} else {
	%>
	Invalid Login , Pls
	<a href="login.html">Retry</a>
	<%
		}
	%>

</body>
</html>