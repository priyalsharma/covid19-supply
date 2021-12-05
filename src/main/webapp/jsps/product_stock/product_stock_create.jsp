<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Product Stock</title>
    
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
  <h1>Create Product Stock</h1>
<form action="<c:url value='/Product_stockServletCreate'/>" method="post">
	product_id    :<input type="text" name="product_id" value="${form.product_id }"/>
	<span style="color: red; font-weight: 900">${errors.product_id }</span>
	<br/>
	product_name：<input type="text" name="product_name" value="${form.product_name }"/>
	<span style="color: red; font-weight: 900">${errors.product_name }</span>
	<br/>
	available_quantity	：<input type="text" name="available_quantity" value="${form.available_quantity }"/>
	<span style="color: red; font-weight: 900">${errors.available_quantity }</span>
	<br/>
	supplier_id	：<input type="text" name="supplier_id" value="${form.supplier_id }"/>
	<span style="color: red; font-weight: 900">${errors.supplier_id }</span>
	<br/>
	<input type="submit" value="Create Product Stock"/>
</form>
  </body>
</html>
