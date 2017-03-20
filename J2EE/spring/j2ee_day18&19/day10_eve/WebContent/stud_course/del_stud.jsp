<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="course" class="beans.CourseRegistrationBean" scope="session"/>
<body>
<form >
	Student  ID : <input type="text" name="sid"/><br/>
	<input type="submit"  name="btn" value="Cancel Student Admission"/>
</form>
</body>
<c:if test="${param.btn == 'Cancel Student Admission'}">
	<jsp:setProperty property="*" name="course" />

	Deleted student : ${course.delete}


	
</c:if>

<a href="course.jsp">Back To Main</a>

</html>