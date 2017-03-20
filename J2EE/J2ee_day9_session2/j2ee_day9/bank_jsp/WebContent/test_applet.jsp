<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:plugin archive="test_applet.jar"
		code="applet_thrds.MyBallsJApplet"
		codebase="http://localhost:8080/bank_jsp/" type="applet" width="500"
		height="400"></jsp:plugin>
</body>
</html>