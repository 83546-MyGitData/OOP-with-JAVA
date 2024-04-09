package com.app.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	
	public double wage;
	public double hrs;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter worked hours: ");
		hrs = sc.nextDouble();
		System.out.println("Enter hourly wages:");
		wage = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hrs=" + hrs + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", SSN=" + SSN + "]";
	}



	@Override
	public void calculateTotalSalary() {
		double salary = 0;
		if(hrs<=40) {
			salary = wage*hrs;
		}else if(hrs > 40) {
			salary = 40*wage + (hrs - 40)*wage*1.5;
		}
		System.out.println("Salary based on Hours: "+salary);
	}

}
