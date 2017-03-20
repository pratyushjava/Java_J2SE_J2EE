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
		Enter Question Text  <input type="text" name="q_text" /><br />
		 Enter Option1  <input type="text" name="options" /><br /> 
		  Enter Option2  <input type="text" name="options" /><br />
		   Enter Option3  <input type="text" name="options" /><br />
		    Enter Option4  <input type="text" name="options" /><br />
		  Enter Ans  <input type="text" name="ans" /><br />
		<input type="submit" name="btn" value="Add Question" />
	</form>

</body>
<center>
	<c:if test="${param.btn == 'Add Question'}">
		
	<%
	   Session hs=HibernateUtils.getSession();
	   Transaction tx=hs.beginTransaction();
	   try {
		   String txt=request.getParameter("q_text");
		   String[] opts=request.getParameterValues("options");
		   String ans=request.getParameter("ans");
		   Questions q=new Questions(txt,opts,ans);
		   out.print("Question added with id="+hs.save(q));
		   out.println("Added question details "+q);
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