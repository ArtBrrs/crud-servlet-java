package br.com.artbrrs.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	String call(HttpServletRequest req, HttpServletResponse rest) throws ServletException, IOException;
	
}
