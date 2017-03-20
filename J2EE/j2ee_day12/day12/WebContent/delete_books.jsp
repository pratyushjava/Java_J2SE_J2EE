<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Books</title>
</head>
<body>
<jsp:useBean id="book" class="beans.BookBean" scope="session"/>


<center>
<h3>Books Delete Form</h3>
<form>
Enter Date (dd-mm-yyyy) <input type="text" name="sdate"/><br/>
<input type="submit" value="Delete Books" name="delete"/>
</form>
</center>
<c:if test="${param.delete == 'Delete Books'}">
<jsp:setProperty property="*" name="book"/>
<h3>${book.delete}</h3>
</c:if>
<a href="welcome.html">Back To Main Page</a>
</body>
</html>