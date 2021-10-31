<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body A</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h3>Entities in project</h3>
		<a href="<c:url value='/jsps/task/task_menu.jsp'/>" target="_parent">hospital</a>
		<br>
		<a href="<c:url value='/jsps/task_status/task_status_menu.jsp'/>" target="_parent">customer</a>
		<br> 
		<a href="<c:url value='/jsps/campaign/campaign_menu.jsp'/>" target="_parent">product_stock</a>
		<br>
		<a href="<c:url value='/jsps/donation/donation_menu.jsp'/>" target="_parent">supplier</a>
		<br> 
		<a href="<c:url value='/jsps/charity_organization/charity_organization_menu.jsp'/>" target="_parent">delivery_staff</a>
		<br>
    
  </body>
</html>