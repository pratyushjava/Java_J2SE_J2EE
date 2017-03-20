<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="calc.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	U R getting logged out ....
	<br />
	<%
		CalcSLSBRemote ref = (CalcSLSBRemote) session
				.getAttribute("rem_ref");
		ref.logout();
		session.invalidate();
	%>
	<a href="index.jsp">Re-start</a>
</body>
</html>