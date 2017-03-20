<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		
	//	response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Cache-Control", "no-store");
	//	response.setDateHeader("Expires", 0);
	//	response.setHeader("Pragma", "no-cache");
	%>


<% 
	if (session.isNew()) {
		System.out.println("forcing user to login page.....");
		out.print("Not logged in ... U will be taken to login page sooooon");
		response.setHeader("Refresh","10;URL='one.jsp'");
		return;
	}

	out.print("JSess ID "+session.getId()+"<br/>"); 
	out.print("attr val "+session.getAttribute("test1"));
%>
<c:set var="test2" value="200" scope="session"/>
<c:url var="url" value="three.jsp"/>
<a href="${url}" >Next</a>
</body>
</html>