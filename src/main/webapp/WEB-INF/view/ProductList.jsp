<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<c:url value="/product?action=ShowProduct" var="showProduct" />
<c:url value="/product?action=DeleteProduct" var="deleteProduct" />
<c:url value="/product?action=CreateProductForm" var="createProductForm" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Lista de Produtos:</h2>
	<ul>
		<c:forEach  items="${ productList }" var="product">
			
			
			<h3>${ product.name }: </h3>
					
			
			<li>	
				Price: ${ product.price } <br>
				Quantity: ${ product.quantity } <br>
			</li>
			<br>
			<a href="${ showProduct }&id=${product.id}">Edit</a> | <a href="${ deleteProduct }&id=${product.id}">Remove</a>	
			
		</c:forEach>	
	</ul>
	
	<a href="${createProductForm }"> Add Product</a>



</body>
</html>