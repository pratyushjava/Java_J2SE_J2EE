<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<h1>Add New Emp</h1>
<form>
ID : <input type="text" name="f1"/><br/>
Name : <input type="text" name="f2"/><br/>
Salary  : <input type="text" name="f3"/><br/>
<input type="submit" name="action" value="Add Employee"/><br/>
</form>
<c:if test="${param.action == 'Add Employee' }">
<sql:update dataSource="jdbc/mysql_pool">
insert into my_emp (id,name,salary) values(?,?,?)
<sql:param value="${param.f1}"/>
<sql:param value="${param.f2}"/>
<sql:param value="${param.f3}"/>
</sql:update>
</c:if>
<sql:query var="rst" dataSource="jdbc/mysql_pool">
select id,name,salary from my_emp
</sql:query>

<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>SALARY</th>
</tr>
<c:forEach var="row" items="${rst.rows}">
<tr>
<td>${row.id}</td>
<td>${row.name}</td>
<td>${row.salary}</td>
</tr>
</c:forEach>
</table>

</html>