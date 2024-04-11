package br.com.artbrrs.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateProductForm implements Action {

	@Override
	public String call(HttpServletRequest req, HttpServletResponse rest) throws ServletException, IOException {
		
		return "forward:ProductCreationForm.jsp";
		
	}

}
