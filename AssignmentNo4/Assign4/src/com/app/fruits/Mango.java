package com.app.fruits;

import java.util.Scanner;

public class Mango extends FruitBasket{
	Mango(){
		System.out.println("Parameterless ctor Mango()");
	}
	
	Mango(String name, double weight, String color){
		this.name = "Mango";	
	}
	
	public String taste() {
		return "Sweet";
	}
	
}
