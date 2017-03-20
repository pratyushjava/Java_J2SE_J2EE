
<%@page import="java.util.*,beans.*,pojos.Account" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="user" class="beans.UserBean" scope="session"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    <body>
        <h1>
            Name : ${user.name}<br>
            ID : ${user.id}<br> </h1>
            <center>Acct Details</center>
            
         <br>
         <form action="transactions.jsp">
            <%
                   ArrayList<Account> al=user.getAccts();
                   for (Account a : al)
                     //  out.println("ID "+a.getId() +" TYPE "+a.getType() +"  BAL"+a.getBalance()+"<br>");
                   out.println("<input type='radio' name='id' value='"+a.getId()+"'>"+a+"<br>");
            %>
            Tx Amt <input type="text" name="amt"/><br/>
            <input type="submit" value="Deposit">
            </form>
            <a href="logout.jsp">Log Out</a>
       
    </body>
</html>
