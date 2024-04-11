package br.com.artbrrs.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artbrrs.model.DataBase;
import br.com.artbrrs.model.Product;

public class CreateProduct implements Action {

	@Override
	public String call(HttpServletRequest req, HttpServletResponse rest) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String quantity = req.getParameter("qnt");
		
		Product product = new Product(name, price, quantity);
		
		DataBase db = new DataBase();
		db.addProduct(product);
		
		return "redirect:?action=ListProducts";
		
	}
	
	
	
}
