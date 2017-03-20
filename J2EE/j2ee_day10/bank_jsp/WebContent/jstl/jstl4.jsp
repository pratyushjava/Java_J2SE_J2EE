<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core"  %>
<jsp:useBean id="bean1" class="beans.Player">
<jsp:setProperty name="bean1" property="*"   />
</jsp:useBean>
<html><head> <title>JSTL JB Test</title></head>
    <body>
<form method=post action="jstl4.jsp">

Name <input   type=text   name="name"><br><br>
Place  <input  type=text    name="place"><br> <br>
Game <input   type=text   name="game"><br><br>
<input type=submit> 
</form> 

Name: <c:out value="${bean1.name}"  /><br> 
Place: <c:out value="${bean1.place}"  /><br> 
Game: <c:out value="${bean1.game}"  /> 

    </body>
</html>