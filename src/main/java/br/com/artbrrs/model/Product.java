package br.com.artbrrs.model;

public class Product {
	
	private Integer id;
	private String name;
	private String price;
	private String quantity;
	
	public Product(String name, String price, String quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {	
		this.quantity = quantity;
	}

	
	
}
