<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSTL Test</title>
</head>
<body bgcolor=lightblue>
<form method=post action=jstl5.jsp>
<select name="combo1">
	<option value="Aa">aa
	<option value="Bb">bb
</select> <input type="submit"></form>
<c:set var="s" value="${param.combo1}" />
<c:out value="${s}" />
<br>

<c:if test="${s    eq     'Aa'  }">
	<c:out value="Good Morning..Aa" />
</c:if>

<c:if test="${s   ==     'Bb'}">
	<c:out value=" How Are You?....Bb" />
</c:if>
</body>
</html>
