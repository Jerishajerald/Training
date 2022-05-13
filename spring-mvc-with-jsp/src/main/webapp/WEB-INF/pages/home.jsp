<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<h1 style='text-align:center'> PRODUCT TABLE </h1>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
table{
border:1px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,td,th{
border:1px solid blue

</style>
</head>
<body style="background-color:pink;">



<table border="1"
           bgcolor="gray">
<tr>
<th>Product Id  </th>
<th>  Product Name  </th>
<th>  Product price  </th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td>${eachItem.productId} </td>
<td> ${eachItem.productName} </td>
<td> ${eachItem.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>