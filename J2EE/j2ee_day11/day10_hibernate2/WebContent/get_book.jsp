<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.hibernate.*,pojos.BookDatePOJO,utils.HibernateUtils"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int id=Integer.parseInt(request.getParameter("f1"));
			Session hibSession = null;
			Transaction tx = null;
			try {
		//from try block get hib session from SF
		hibSession = HibernateUtils.getSession();

		//from Hib session begin Transaction
		tx = hibSession.beginTransaction();
		//within Tx scope --- fire Hib api
		
			BookDatePOJO b=(BookDatePOJO)hibSession.get(BookDatePOJO.class,id);
				if (b != null)
					out.println("Book retrieved --- "+b);
		else
			out.println("Book not found with id="+id);
		//if success --- commit tx ow rollback
		tx.commit();
		//MUST close hib session from finally block.
			} catch (Exception e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
			} finally {
		if (hibSession != null)
			hibSession.close();
			}
	%>
</body>
</html>