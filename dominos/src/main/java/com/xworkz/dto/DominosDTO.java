package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@Entity

@Table(name = "dominos")
public class DominosDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pizzaID;
	@NonNull
	@Column(name="NAME")
	private String name;
	@NonNull
	@Column(name="LOCATION")
	private String location;
	@NonNull
	@Column(name="PRICE")
	private double price;
	@NonNull
	@Column(name="IS_AVAILABLE")
	private boolean isAvailable;
	@NonNull
	@Column(name="SIZE")
	private String size;
	
	public DominosDTO(){
		System.out.println("default constructor created"+this.getClass().getSimpleName());
	}

}
