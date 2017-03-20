<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="javax.naming.*,emp.Employee,entities.*"%>
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
 Employee ref=(Employee) ctx.lookup("emp_slsb");
 System.out.println("ref="+ref);
	MyEmp m1=new MyEmp("pune", "rnd", new Date(),"abc2", 3700);
	System.out.print("in jsp m1="+m1);
	out.println("Added Emp1 "+ref.addEmp(m1));
    out.println(ref.getEmployees());
%>
<%= ref.getEmployees() %>
 
</body>
</html>