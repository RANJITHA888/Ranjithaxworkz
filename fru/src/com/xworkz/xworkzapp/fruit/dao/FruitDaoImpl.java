package com.xworkz.xworkzapp.fruit.dao;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.xworkzapp.fruit.dto.FruitDto;

public class FruitDaoImpl implements FruitDao {
	LinkedList fruit = new LinkedList();

	@Override
	public void addFruit(FruitDto dto) {
		fruit.push(dto);
		System.out.println("added succesfully:" + fruit.size());

	}

	@Override
	public void removeFruit() {
		fruit.pop();
		System.out.println("removed succesfully:" + fruit.size());

	}

	@Override
	public void display() {
		for(Iterator iterator=fruit.iterator();iterator.hasNext();){ 
			FruitDto dto=(FruitDto)iterator.next();//down casting
			System.out.println("**************");
			System.out.println(dto.getColor()+" "+dto.getFruitName()+" "+dto.getPrice());
			
		}
		
	}
	
	

	}
