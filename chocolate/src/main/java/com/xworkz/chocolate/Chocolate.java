package com.xworkz.chocolate;

public class Chocolate {
	private String name;
	private String size;
	private double price;
	private String brand;

	public Chocolate(String name, String size, double price, String brand) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.brand = brand;
	}
	
	public Chocolate(String name, String size) {
		super();
		this.name = name;
		this.size = size;
		System.out.println("two parameter constructor");
	}

	public Chocolate(){
		System.out.println("default parameter");
	} 
	

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", size=" + size + ", price=" + price + ", brand=" + brand + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void tasty() {
		System.out.println("invoked tasty");
		System.out.println("chocolate has tasty");
	}

	public void stressReliver() {
		System.out.println("invoked stressReliver");
		System.out.println("eat choclate to reduce stress");

	}

}
