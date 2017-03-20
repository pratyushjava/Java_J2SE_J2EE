<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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

<center>


	<%
		Session hs = HibernateUtils.getSession();
		Transaction tx = hs.beginTransaction();
		List<Questions> l1 = null;
		try {
			l1 = hs.createQuery("from Questions").list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			if (hs != null)
				hs.close();
		}
		//		String[] data={"a","b","c"};
	%>
	<%--	<c:forEach var="d" items="<%= data  %>">
	${d}
	</c:forEach>
	<br/><br/> --%>
	<form action="selected.jsp">
		<c:forEach var="quest" items="<%=l1%>">
	${quest.qid}   ${quest.qText}  ${quest.ans}
	<input type="hidden" name="qid" value="${quest.qid}" />
			<br />
			<%--	<%
			String[] opts = ((Questions) pageContext.getAttribute("quest"))
						.getOptions();
				for (String s : opts)
					System.out.print(s + "  ");
		%> --%>
			<br />
			<%-- Printing Opts : <c:out value="${quest.options}"/> --%>
			<c:forEach var="opt1" items="${quest.options}" varStatus="sts">

				<input type="radio" name="" value=" ${sts.index}" />
				<c:out value="${opt1}"></c:out>
				<br />
			</c:forEach>
			<hr />

		</c:forEach>
		<input type="submit" value="Submit Test"/>
	</form>

</center>

</html>