
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html><head> <title>JSTL Test</title></head>
<body bgcolor=lightblue>
 <form>
 NAME <input  type=text  name="text1"><br><br>
 PLACE<input  type=text  name="text2"><br><br>
       <input type=submit>
 </form> 
    <br>
 NAME:<c:out value="${param.text1}"  /><br>
 PLACE:<c:out value="${param.text2}"  />
</body>
</html>

