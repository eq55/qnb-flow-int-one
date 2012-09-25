<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page isELIgnored="false" %>

<html>
	<head>
	</head>
	<body>
		<h2>Please enter your vehicle registration number</h2>
		<form method="post">
			<input type="text" id="vrn" name="customerVrn" />
			<input type="submit" name="_eventId_submit" />
		</form>
	</body>
</html>