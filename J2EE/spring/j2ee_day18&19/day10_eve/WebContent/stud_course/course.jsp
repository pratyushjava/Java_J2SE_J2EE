<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="course" class="beans.CourseRegistrationBean" scope="session"/>
<body>
<a href="add_course.jsp">Launch New Course</a><br/>
<a href="display_students.jsp">Display Students enrolled for a Course</a><br/>

<a href="add_stud.jsp">Register Student</a><br/>
<a href="del_stud.jsp">Delete Student</a><br/>

</body>
</html>