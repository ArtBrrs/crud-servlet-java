package br.com.artbrrs.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artbrrs.actions.Action;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String actionParam = req.getParameter("action");		
		
		String path = null;
		
		try {
			Class classe = Class.forName("br.com.artbrrs.actions." + actionParam);
			Action action = (Action) classe.newInstance();
			path = action.call(req, resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}	
		
		String[] toWhere = path.split(":");
		
		if (toWhere[0].equals("forward")) {
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + toWhere[1]);
			rd.forward(req, resp);
		} else {
			resp.sendRedirect(toWhere[1]);
		}
			
		
//		if (actionParam.equals("CreateProductForm")) {
//			
//			CreateProductForm cpf = new CreateProductForm();			
//			path = cpf.call(req, resp);			
//		} 
//		else if (actionParam.equals("CreateProduct")) {
//			
//			CreateProduct cp = new CreateProduct();			
//			path = cp.call(req, resp);		
//		}
//		else if (actionParam.equals("ListProducts")) {
//			
//			ListProducts lp = new ListProducts();
//			path = lp.call(req, resp);
//		} 
//		else if (actionParam.equals("ShowProduct"))	{
//			
//			ShowProduct sp = new ShowProduct();
//			path = sp.call(req, resp);
//		}		
//		else if (actionParam.equals("UpdateProduct"))	{
//			
//			UpdateProduct up = new UpdateProduct();
//			path = up.call(req, resp);
//		} else if (actionParam.equals("DeleteProduct")) {
//			
//			DeleteProduct dp = new DeleteProduct();
//			path = dp.call(req, resp);
//			
//		}
		 
		
		
		
		
	
	
	}

}
