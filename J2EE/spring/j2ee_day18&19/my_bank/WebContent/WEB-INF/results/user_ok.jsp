

<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    <body>
    <form action="transactions.jsp">
        <table border="1">
    <thead>
        <tr>
        <th></th>
            <th>AC_ID</th>
            <th>TYPE</th>
            <th>BALANCE</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${user.accts}" var="ac">
     
                <tr>
             <td>      <input type='radio' name='id' value='${ac.id}'></td>
            <td>${ac.id}</td>
            <td>${ac.type}</td>
            <td>${ac.balance}</td>
        </tr>
        </c:forEach>
		<tr>
		<td></td>
		<td>Tx Amt </td>
		<td><input type="text" name="amt"/></td>
		<td><input type="submit" value="Deposit"></td>
		</tr>
    </tbody>
</table>
 
            
</form>
        
        <a href="logout.jsp"> LogOut </a>
    </body>
</html>
