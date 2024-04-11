package br.com.artbrrs.actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artbrrs.model.DataBase;
import br.com.artbrrs.model.Product;

public class ListProducts implements Action{

	@Override
	public String call(HttpServletRequest req, HttpServletResponse rest) throws ServletException, IOException {
		
		List<Product> productList = DataBase.getProductList();
		
		req.setAttribute("productList", productList);
		
		return "forward:ProductList.jsp";
		
	}

}
