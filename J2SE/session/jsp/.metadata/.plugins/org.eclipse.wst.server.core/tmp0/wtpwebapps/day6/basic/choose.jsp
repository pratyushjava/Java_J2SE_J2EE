<%@page import="cust_exc.BrowserNotSupportedException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="err_handler.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!String supportedBrowser = "FireFox";%>
	<%
		String browser1 = request.getParameter("browser");
		//chk if browser selection supported
		if (browser1.equalsIgnoreCase("firefox")) {
			//include success page via directive
	%>
	<%@ include file="success.jsp"%>
	<%
		} else
			throw new BrowserNotSupportedException(
					"Invalid Selection: Selected Browser  " + browser1
							+ " Not yet supported......");
	%>
</body>
</html>