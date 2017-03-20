<%@page import="java.util.List"%>
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
		String auth = request.getParameter("f1");
			double price1 = Double.parseDouble(request.getParameter("f2"));
			double amt = Double.parseDouble(request.getParameter("f3"));
			Session hs = null;
			Transaction tx = null;
			try {
		hs = HibernateUtils.getSession();
		tx = hs.beginTransaction();
		//CRUD --- update
		//retrieve Persistent pojos from DB matching  criteria
		String hql = "from BookPOJO b where b.author=:p1 and b.price > :p2";
		List<BookDatePOJO> l1 = hs.createQuery(hql)
				.setParameter("p1", auth).setParameter("p2", price1)
				.list();
		out.println("Existing list " + l1+"<br/>");
		for (BookDatePOJO b : l1)
			b.setPrice(b.getPrice()-amt);
		out.print("Books updated successfully....");
		tx.commit();
			} catch (Exception e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
			} finally {
		if (hs != null)
			hs.close();
			}
	%>
</body>
</html>