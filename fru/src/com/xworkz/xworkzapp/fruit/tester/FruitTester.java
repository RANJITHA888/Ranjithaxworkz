package com.xworkz.xworkzapp.fruit.tester;

import com.xworkz.xworkzapp.fruit.dao.FruitDao;
import com.xworkz.xworkzapp.fruit.dao.FruitDaoImpl;
import com.xworkz.xworkzapp.fruit.dto.FruitDto;

public class FruitTester {
	
	public static void main(String[] args) {
		FruitDto fd1=new FruitDto("apple", "red", 50);
		FruitDto fd2=new FruitDto("mango", "yellow", 100);
		FruitDto fd3=new FruitDto("grapes", "black", 200);
		FruitDto fd4=new FruitDto("chiku", "brown", 300);
		
		FruitDao d1=new FruitDaoImpl();
		d1.addFruit(fd1);
		d1.addFruit(fd2);
		d1.addFruit(fd3);
		d1.addFruit(fd4);
		d1.display();
		d1.removeFruit();
		d1.display();

		
	}

}
