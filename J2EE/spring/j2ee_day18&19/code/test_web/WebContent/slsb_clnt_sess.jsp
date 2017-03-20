<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="javax.naming.*,calc.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Calculator ref = null;
		if (session.getAttribute("rem_ref") == null) {
			System.out.println("new user");
			//get IC
			InitialContext ic = new InitialContext();
			//perform lookup
			ref = (Calculator) ic.lookup("my_calc");
			session.setAttribute("rem_ref", ref);
		} else
			ref = (Calculator) session.getAttribute("rem_ref");
		double d1 = Double.parseDouble(request.getParameter("f1"));
		double d2 = Double.parseDouble(request.getParameter("f2"));
		out.println("Result=" + ref.add(d1, d2));
	%>
	<c:url value="slsb_clnt_sess.jsp" var="url">
	<c:param name="f1">${param.f1}</c:param>
	<c:param name="f2">${param.f2}</c:param>
	</c:url>
	<a href="${url}">Refresh</a>
	<c:url var="url" value="logout.jsp"/>
	<a href="${url}">Log Out</a>
</body>

</html>