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
		//chk if 1st req .....
		
		CalcSLSBRemote ref = (CalcSLSBRemote) session.getAttribute("rem_ref");
		if (ref == null) {
			//perform lookup using JNDI name ---get EJBOBJStub ref ---dyn 
			//downloaded by EJBC --- store it in POJI ref.
			System.out.println("1st time");
			ref = (CalcSLSBRemote) ctx.lookup("my_calc");
		//works fine 		ref = (CalcSLSBRemote) ctx.lookup("java:global/test_ejb/CalcSLSB");
			session.setAttribute("rem_ref", ref);
		}
	%>
	Result1 =
	<%=ref.add(Double.parseDouble(request.getParameter("f1")),
					Double.parseDouble(request.getParameter("f2")))%>
	<a href="logout.jsp">Logout</a>
</body>
</html>