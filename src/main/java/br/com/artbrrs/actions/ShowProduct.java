package br.com.artbrrs.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artbrrs.model.DataBase;
import br.com.artbrrs.model.Product;

public class ShowProduct implements Action {

	@Override
	public String call(HttpServletRequest req, HttpServletResponse rest) throws ServletException, IOException {
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		DataBase db = new DataBase();
		Product product = db.showProduct(id);
		
		req.setAttribute("product", product);
		
		return "forward:ProductUpdateForm.jsp";
		
		
		
	}

}
