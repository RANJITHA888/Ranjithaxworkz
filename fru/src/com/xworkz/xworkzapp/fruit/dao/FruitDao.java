package com.xworkz.xworkzapp.fruit.dao;

import com.xworkz.xworkzapp.fruit.dto.FruitDto;

public interface FruitDao {
	
	public void addFruit(FruitDto dto);
	public void removeFruit();
	public void display();

}
