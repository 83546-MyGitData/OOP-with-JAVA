package com.app.sunbeam;

import java.util.*;

public class SalariedEmployee extends Employee{
	public double weeklySalary;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter Weekly Salary: ");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", SSN=" + SSN + "]";
	}

	@Override
	public void calculateTotalSalary() {
		System.out.println("Weekly Salary: "+weeklySalary);
	}


}
