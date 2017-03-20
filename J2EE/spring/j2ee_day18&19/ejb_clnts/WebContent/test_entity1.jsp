<%@page import="entities.Dac1Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="javax.naming.*,slsb_facade.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here123</title>
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
Testing.....
<%
//perform lookup using JNDI name ---get EJBOBJStub ref ---dyn 
//downloaded by EJBC --- store it in POJI ref.
 MovieDAO dao=(MovieDAO)ctx.lookup("movie_dao");
 System.out.println("ref1="+dao);
 System.out.println(dao.test("hello"));
 out.println(dao.listAllMovies());
// Dac1Book bookDao=(Dac1Book) ctx.lookup("");
 out.println(dao.getAllBooks());
 
%>

 
</body>
</html>