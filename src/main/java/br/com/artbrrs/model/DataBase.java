package br.com.artbrrs.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DataBase {

	private static List<Product> productList = new ArrayList<>();
	private static Integer primaryKey = 1;
	
	static {
		
		Product product1 = new Product("Escova de dente", "9,90", "10");
		product1.setId(primaryKey++);
		Product product2 = new Product("Luva de Boxe Pretorian", "199,90", "2");
		product2.setId(primaryKey++);
		
		productList.add(product1);	
		productList.add(product2);	
	}
	
	public void addProduct(Product product) {
		
		product.setId(primaryKey++);
		productList.add(product);	
	}
	
	public Product showProduct(Integer id) {
		
		Iterator<Product> iterador = productList.iterator();
		
		while (iterador.hasNext()) {
			Product product = iterador.next();
			
			if (product.getId().equals(id)) {
				return product;
			}
		}
		
		return null;
		
	}
	
	public void updateProduct(Integer id, String name, String price, String quantity) {
		
		Product product = showProduct(id);
		
		product.setName(name);
		product.setPrice(price);
		product.setQuantity(quantity);
		
	}
	
	public void deleteProduct(Integer id) {
		
		Product product = showProduct(id);
		
		productList.remove(product);
		
	}
	

	public static List<Product> getProductList() {
		return DataBase.productList;
	}
	
	
	
	
	
	
}
