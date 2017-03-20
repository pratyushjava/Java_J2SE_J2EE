<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/tlds/example" prefix="test" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books Delete By Author N Date</title>
</head>

<body>
	<form>
	
		Author <input type="text" name="author1" /><br /> 
		 Enter Book Pub Date(dd-MMM-yyyy) <input type="text" name="pDate1" /><br /> 
		 <input type="submit" name="btn"	value="Delete Books" />
	</form>

</body>
<center>
	<c:if test="${param.btn == 'Delete Books'}">
	
		<%--invoke tag --%>
		Books Deleted Status <test:delete author="${param.author1}" pDate="${param.pDate1}"/>
</c:if>
</center>
<a href="welcome.html">Back to main Page</a>
</html>