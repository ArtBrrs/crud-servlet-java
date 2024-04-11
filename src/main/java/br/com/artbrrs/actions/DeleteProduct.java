package br.com.artbrrs.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artbrrs.model.DataBase;

public class DeleteProduct implements Action{

	@Override
	public String call(HttpServletRequest req, HttpServletResponse rest) throws ServletException, IOException {
		
		String idParam = req.getParameter("id");
		
		Integer id = Integer.valueOf(idParam);
		
		DataBase db = new DataBase();
		db.deleteProduct(id);
		
		return "redirect:?action=ListProducts";
		
		
	}
	
	
}
