package br.com.artbrrs.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artbrrs.model.DataBase;

public class UpdateProduct implements Action {

	@Override
	public String call(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String idParam = req.getParameter("id");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String quantity = req.getParameter("qnt");
		
		Integer id = Integer.valueOf(idParam);
		
		DataBase db = new DataBase();
		db.updateProduct(id, name, price, quantity);
		
		return "redirect:?action=ListProducts";
		
		
		
		
		
		
		
		
	}
	
	

}
