<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="course" class="beans.CourseRegistrationBean" scope="session"/>
<body>
	<form>
		Student Name : <input type="text" name="sName" /><br /> 
		Address : <input type="text" name="addr" /><br /> 
		Course Name : <input type="text" name="cName" /><br />
		 <input type="submit" name="btn" value="Add Student" />
	</form>
</body>
<c:if test="${param.btn == 'Add Student'}">
in if
	<jsp:setProperty property="*" name="course" />
${course.stud}

	
</c:if>

<a href="course.jsp">Back To Main</a>
</html>