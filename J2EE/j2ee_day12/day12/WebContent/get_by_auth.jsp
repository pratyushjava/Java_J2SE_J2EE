<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="book" class="beans.BookBean" scope="session"/>
<jsp:setProperty property="*" name="book"/>


<body>
<center>All Books By : ${param.author}
<table border="1">
<tr><th>Book ID</th>
<th>Author</th>
<th>Title</th>
<th>Price</th>
<th>Publish Date</th>
</tr>
<c:forEach var="bk" items="${book.selectedBooks}">
<tr>
<td>${bk.bookId}</td>
 <td>${bk.author}</td>
 <td> ${bk.title} </td>
 <td> ${bk.price} </td>
 <td> ${bk.publicationDate}</td>
 </tr>
</c:forEach>
</table>
<a href="welcome.html">Back To Main Page</a>
</center>
</body>
</html>