<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="javax.naming.*,calc.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%!InitialContext ctx;

	public void jspInit() {
		try {
			ctx = new InitialContext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>
<body>
<%
//perform lookup using JNDI name ---get EJBOBJStub ref ---dyn 
//downloaded by EJBC --- store it in POJI ref.
 CalcSLSBRemote ref=(CalcSLSBRemote) ctx.lookup("my_calc");
%>
Result = <%= ref.add(Double.parseDouble(request.getParameter("f1")),Double.parseDouble(request.getParameter("f2"))) %>
</body>
</html>