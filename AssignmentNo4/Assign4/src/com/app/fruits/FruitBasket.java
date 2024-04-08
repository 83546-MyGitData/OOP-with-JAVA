package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
	
	public String color;
	public double weight;
	public String name;
	public boolean isFresh = true;
	
	FruitBasket(){
		System.out.println("Parameterless() FruitBasket");
	}
	
	FruitBasket(String name, double weight, String color){
		System.out.println("Parameterized() FruitBasket");
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc){
		System.out.println("Enter the fruit details: ");
		System.out.println("Enter Fruit Name: ");
		name = sc.next();
		System.out.println("Enter Fruit Weight: ");
		weight = sc.nextDouble();
		System.out.println("Enter Fruit Color: ");
		color = sc.next();
	}
	
	public void display() {
		System.out.println("Fruit Name: "+name);
		System.out.println("Fruit Weight: "+weight);
		System.out.println("Fruit Color: "+color);
		System.out.println("*********************************************");
	}
	
	@Override
	public String toString() {
		return "Fruit Name: "+name+"::"+weight+"::"+color;
	}
	
	public String taste() {
		return "no specific taste";
	}	
}























