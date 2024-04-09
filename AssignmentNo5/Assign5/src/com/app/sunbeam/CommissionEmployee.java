package com.app.sunbeam;

import java.util.Scanner;

public class CommissionEmployee extends Employee {

	public double grossSale;
	public double commissionRate;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter Gross Sale: ");
		grossSale = sc.nextDouble();
		System.out.println("Enter Commission Rate: ");
		commissionRate = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "CommissionEmployee [grossSale=" + grossSale + ", commissionRate=" + commissionRate + ", firstName="
				+ firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}


	@Override
	public void calculateTotalSalary() {
		System.out.println("Salary of Commission Employee: "+(commissionRate*grossSale));
	}
	
	

}
