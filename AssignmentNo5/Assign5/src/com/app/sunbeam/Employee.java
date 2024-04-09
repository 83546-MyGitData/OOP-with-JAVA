package com.app.sunbeam;

import java.util.*;

public abstract class Employee { //super
	public String firstName;
	public String lastName;
	public int SSN;
	
	Employee(){
		System.out.println("Employee()");
	}
	
	Employee(String firtsName, String lastName, int SSN){
		this.firstName = firtsName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	public int getSSN() {
		return SSN;
	}
	
	public void acceptEmployee(Scanner sc) {
		System.out.println("Please enter following details: ");
		System.out.println("Enter First Name: ");
		firstName = sc.next();
		System.out.println("Enter Last Name: ");
		lastName = sc.next();
		System.out.println("Enter SSN: ");
		SSN = sc.nextInt();
		
	}
	
	@Override
	public String toString() {
		return "EMPLOYEE: (FirstName): "+firstName+",(LastName):"+lastName+",(SSN):"+SSN;
	}
	
	public abstract void calculateTotalSalary(); 
	
}
