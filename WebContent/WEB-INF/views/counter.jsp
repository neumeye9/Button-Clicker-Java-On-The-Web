<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java Button Clicker</title>
</head>
<body>
	<form action="/ButtonClicker/counter" name="counter" method="get">
		<input type="submit" value="Click Me!"></input>
	</form>
	<h2>You have clicked this button <c:out value = "${counter}"/> times.</h2>
</body>
</html>