<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:set var="propertyPrefix" value="LV.Motor.AboutYou" />
<%@ page isELIgnored="false" %>

<html>
<body>
<h1>Vehicle Search</h1>
<form:form modelAttribute="vehicleSearchCriteria">
	<form:input path="vrn"/>
	<button type="submit" id="search" name="_eventId_search">Search</button>
</form:form></body>
</html>

