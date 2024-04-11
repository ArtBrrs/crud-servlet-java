<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/product?action=UpdateProduct" var="updateProduct"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${ updateProduct }" method="post">
		
		<label>
			Name: 
			<input type="text" name="name" value="${ product.name }">
		</label>	
		<label>
			Price: 
			<input type="text" name="price" value="${ product.price }">
		</label>
		<label>
			Quantity: 
			<input type="text" name="qnt" value="${ product.quantity }">
		</label>
		
		<input type="submit" value="send">
		<input type="hidden" name="id" value="${ product.id }">
	
	
	</form>

</body>
</html>