<%@ page import="beans.*" %>
U R being Logged Out.
<%
  ((UserBean)session.getAttribute("user")).getBankDao().closeCtx();
  session.invalidate();
%>
Please <a href="bank_login.jsp">Login</a> to re-enter.
