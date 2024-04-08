package com.app.fruits;

import java.util.Scanner;

public class Orange extends FruitBasket{
	Orange(){
		System.out.println("Parameterless ctor Orange()");
	}
	
	Orange(String name, double weight, String color){
		this.name = "Orange";
		
	}
	
	
	public String taste() {
		return "Sour";
	}
	
}
