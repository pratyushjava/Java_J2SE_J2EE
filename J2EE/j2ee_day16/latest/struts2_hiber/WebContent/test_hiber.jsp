<%@page import="java.util.GregorianCalendar"%>

<%@page import="java.util.List"%>
<%@page import="pojos.*"%>
<%@page import="utils.HibernateUtils"%>
<%@page import="org.hibernate.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//get SF
	SessionFactory sf = HibernateUtils.getFactory();
	//open session
	Session hibSession = sf.openSession();
	Transaction tx = null;
	try {
		//begin tx
		tx = hibSession.beginTransaction();
		List<Contact> l1=hibSession.createQuery("from Contact where birthDate > :dt").setCalendar("dt",new GregorianCalendar(1995,1,1)).list();
		for (Contact c : l1)
		 out.println("email "+c.getEmailId()+"  <br/> ");
		//commit tx
		tx.commit();
	} catch (Exception e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
	} finally {
		hibSession.close();
	}
%>
</body>
</html>