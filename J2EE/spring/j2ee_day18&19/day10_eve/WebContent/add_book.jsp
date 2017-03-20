<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form>
		Enter Book Title <input type="text" name="title" /><br />
		 Enter Book Author <input type="text" name="author" /><br /> 
		 Enter Book Price <input 	type="text" name="price" /><br />
		  Enter Book Pub Date(dd-MMM-yyyy) 	<input type="text" name="pDate" /><br /> 
		<input type="submit" name="btn" value="Add Book" />
	</form>

</body>
<center>
	<c:if test="${param.btn == 'Add Book'}">
		
		<jsp:setProperty property="*" name="book" />
		Book Added Status ${book.status}
</c:if>
</center>
<a href="welcome.html">Back to main Page</a>
</html>