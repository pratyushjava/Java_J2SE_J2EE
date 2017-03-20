<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Books</title>
</head>

<body>
	<form>
		
		 Enter Book Author <input type="text" name="author" /><br /> 
		<input type="submit" name="btn" value="View Books" />
	</form>

</body>
<center>
	<c:if test="${param.btn == 'View Books'}">
		
		<jsp:setProperty property="*" name="book" />
		Books Available By ${param.author}<br/>
		<c:forEach var="bk" items="${book.bookByAuthor}">
		Book Title ${bk.title} Author ${bk.author} Price ${bk.price}<br/>
		</c:forEach>
</c:if>
</center>
<a href="welcome.html">Back to main Page</a>
</html>