<%@page import="pojos.Questions"%>
<%@page import="utils.HibernateUtils"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.hibernate.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form>
		Enter Question ID  <input type="text" name="q_id" /><br />
		<input type="submit" name="btn" value="Disp Question" />
	</form>

</body>
<center>
	<c:if test="${param.btn == 'Disp Question'}">
		
	<%
	   Session hs=HibernateUtils.getSession();
	   Transaction tx=hs.beginTransaction();
	   try {
		   int id=Integer.parseInt(request.getParameter("q_id"));
		   out.print("Question Displayed with id="+id+" "+hs.get(Questions.class,id));
		 
		   tx.commit();
	   } catch (Exception e)
	   {
		   tx.rollback();
		   e.printStackTrace();
	   }
	   finally {
		   if (hs != null)
			   hs.close();
	   }
	%>
</c:if>
</center>
<a href="welcome.html">Back to main Page</a>
</html>