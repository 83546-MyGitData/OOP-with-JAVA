package com.app.sunbeam;

import java.util.Scanner;

public class BasePlus extends CommissionEmployee{
	
	public double baseSalary;
	
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter Base Salary: ");
		baseSalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "BasePlus [baseSalary=" + baseSalary + ", grossSale=" + grossSale + ", commissionRate=" + commissionRate
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + ", toString()="
				+ super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSSN()=" + getSSN() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public void calculateTotalSalary() {
		double Salary;
		Salary = (commissionRate * grossSale) + baseSalary;
		System.out.println("Salary: "+Salary);
	}
	
	public void SalaryAfterIncrement() {
		double salary_after_increment = ((commissionRate * grossSale) + baseSalary) + 0.10 * baseSalary;
		
		System.out.println("Salary After Increment: "+salary_after_increment);
	}

}


