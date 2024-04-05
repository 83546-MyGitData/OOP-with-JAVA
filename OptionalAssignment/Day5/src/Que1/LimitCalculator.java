package Que1;

import java.util.Scanner;

public class LimitCalculator {
	private final int accno;
	private String name;
	private double beginingBalance;
	private double totalCharged;
	private int totalCredits;
	private int creditLimit;
	private static int generate_accno;
	
	Scanner sc = new Scanner(System.in);
	
	
	static {
		generate_accno = 1000;
	}
	
	//object Initializer
	{
		accno = ++generate_accno;
	}
	LimitCalculator(){
		System.out.println("Parameterless ctor");
	}
	
	public void acceptDetails() {
		System.out.println("Please enter the details");
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter begining balance: ");
		beginingBalance = sc.nextDouble();
		System.out.println("Enter Total items charged: ");
		totalCharged = sc.nextDouble();
		System.out.println("Enter total credits applied in this month: ");
		totalCredits = sc.nextInt();
		System.out.println("Enter allowed Credit Limit: ");
		creditLimit = sc.nextInt();	
	}
	
	public void displayDetails() {
		System.out.println("The Account Credit Details are: ");
		System.out.println("Account No.: " +accno);
		System.out.println("Name: " +name);
		System.out.println("Pending Balance at begining of month: " +beginingBalance);
		System.out.println("Total charges of items: " +totalCharged);
		System.out.println("Total credits applied: " +totalCredits);
		System.out.println("Credit Limit: "+creditLimit);
		double newBalance = beginingBalance + totalCharged - totalCredits;
		System.out.println("New Balance: "+newBalance);
		
		if(newBalance>creditLimit) {
			System.out.println("Credit Limit Exceeded");
		} else {
			System.out.println("Credit Limit not exceeded");
		}
		System.out.println("***********************************************************************************");
	}

public static void main(String[] args) {
	LimitCalculator[]arr;
	arr = new LimitCalculator[2];
	
	for(int i=0; i<arr.length; i++) {
	arr[i] = new LimitCalculator();
	arr[i].acceptDetails();
	arr[i].displayDetails();
	}
	
	for(int i=0; i<arr.length; i++) {
		arr[i].displayDetails();
	}
	
	return;
	
}
}
