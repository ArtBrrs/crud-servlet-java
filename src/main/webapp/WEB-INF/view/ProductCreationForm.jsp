<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<c:url value="/product?action=CreateProduct" var="createProduct"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${ createProduct }" method="post">
		
		<label>
			Name: 
			<input type="text" name="name">
		</label>	
		<label>
			Price: 
			<input type="text" name="price">
		</label>
		<label>
			Quantity: 
			<input type="text" name="qnt">
		</label>
		
		<input type="submit" value="send">
	
	
	</form>

</body>
</html>