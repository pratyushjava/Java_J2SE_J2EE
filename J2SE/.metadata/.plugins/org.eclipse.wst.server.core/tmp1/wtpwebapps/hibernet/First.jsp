<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="org.hibernate.*,pojos.BookPOJO,utils.HibernateUtils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("hi from jsp page");
BookPOJO b1=new BookPOJO(request.getParameter("f1"),Integer.parseInt(request.getParameter("f2")));
Session hibsession=null;
System.out.println("hi from jsp page");
Transaction tx=null;
try{
	System.out.println("hi from jsp page");
	hibsession =HibernateUtils.getsSession();
	tx=hibsession.beginTransaction();
	out.println("book saved by id"+hibsession.save(b1));
	tx.commit();
}catch(Exception e){
	if(tx!=null)
		tx.rollback();
	e.printStackTrace();
}
finally{
	if( hibsession != null)
	   hibsession.close();
}



%>
</body>
</html>