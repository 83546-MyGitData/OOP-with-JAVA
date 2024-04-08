package com.app.fruits;
import java.util.*;
public class Fruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("Please enter number of fruits to buy: ");
		count =sc.nextInt();
		int counter=0;
		int choice;
		FruitBasket[] arr = new FruitBasket[count];
		
		
		
		do {
			System.out.println("Press 0: Exit");
			System.out.println("Press 1: Add Apple");
			System.out.println("Press 2: Add Mango");
			System.out.println("Press 3: Add Orange");
			System.out.println("Press 4: Display names of all fruits in the basket.");
			System.out.println("Press 5: Display name,color,weight,taste of all fresh fruits,in the basket.");
			System.out.println("Press 6: Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("Press 7: Mark a fruit as stale");
			System.out.println("Press 8: Mark all sour fruits stale");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0: //exit
			{
				System.out.println("THANK YOU...");
			}
			break;
			
			case 1:  //add apple
			{
				if(counter<count) {
					arr[counter] = new Apple();
					arr[counter].accept(sc);
					counter++;
				} else {
					System.out.println("Basket is full");
				}
			}
			break;
			
			case 2: //add mango
			{
				if(counter<count) {
					arr[counter] = new Mango();
					arr[counter].accept(sc);
					counter++;
				}else {
					System.out.println("Basket is Full");
				}
			}
			break;
			
			case 3:  //add orange
			{
				if(counter<count) {
					arr[counter] = new Orange();
					arr[counter].accept(sc);
					counter++;
				}else {
					System.out.println("Basket is Full");
				}
			}
			break;
			
			case 4: //Display names of all fruits in the basket
			{
				for (FruitBasket fruitbasket: arr) {
					if(fruitbasket != null) {
						System.out.println(fruitbasket.getName());
					}
				}
			}
			break;
			
			case 5: //Display name,color,weight,taste of all fresh fruits,in the basket
			{
				for(FruitBasket fruitbasket: arr) {
					if(fruitbasket != null) {
						System.out.println(fruitbasket.toString());
						System.out.println(fruitbasket.taste());
						System.out.println(fruitbasket.isFresh());
						System.out.println("******************************************");
					}
				}
			}
			break;
			
			case 6: //Display tastes of all stale(not fresh) fruits in the basket
			{
				for(FruitBasket fruitbasket : arr) {
					if(fruitbasket.isFresh()==false) {
						System.out.println(fruitbasket.taste());
					}
				}
			}
			break;
			
			case 7: //Mark a fruit as stale
				{
					int value;
				System.out.println("Please enter index which you want to make stale fruit: ");
				value = sc.nextInt();
				if(value>=0 || value<arr.length) {
				for(int i=0; i<count; i++) {
					if(count==value) {
						arr[value].setFresh(false);
					}
				}
				}else {
					System.out.println("ERROR: INVALID INDEX!");
				}
				}
				break;
				
			case 8://Mark all sour fruits stale
			{
				for(FruitBasket fruitbasket : arr) {
					if(fruitbasket.taste()== "Sour") {
						fruitbasket.setFresh(false);
					}
				}
			}
			break;
			
			default:
			{
				System.out.println("ERROR: Wrong Choice!! Please enter correct choice");
			}
			}
		}while(choice !=0);
	}
}
