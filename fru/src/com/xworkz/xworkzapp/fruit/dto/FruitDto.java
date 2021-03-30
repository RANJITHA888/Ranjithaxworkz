package com.xworkz.xworkzapp.fruit.dto;

public class FruitDto {
	private String FruitName;
	private String color;
	private int price;

	public FruitDto(String fruitName, String color, int price) {
		super();
		FruitName = fruitName;
		this.color = color;
		this.price = price;
	}

	public final String getFruitName() {
		return FruitName;
	}

	public final void setFruitName(String fruitName) {
		FruitName = fruitName;
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final int getPrice() {
		return price;
	}

	public final void setPrice(int price) {
		this.price = price;
	}
}
