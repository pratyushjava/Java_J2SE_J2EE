<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="book" class="beans.BookBean" scope="session" />
<body>
<a href="add_book.jsp">Add Book</a><br/>
<a href="get_books.jsp">View Books By Author</a><br/>
<a href="delete_books.jsp">Delete Books By Author N date</a>

</body>
</html>