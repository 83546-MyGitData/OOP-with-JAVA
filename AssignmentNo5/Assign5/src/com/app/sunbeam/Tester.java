package com.app.sunbeam;

import java.util.*;
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee e1 = new SalariedEmployee(); //upcasting
		e1.acceptEmployee(sc);
		e1.toString();
		e1.calculateTotalSalary();
		
		Employee e2 = new HourlyEmployee(); //upcasting
		e2.acceptEmployee(sc);
		e2.toString();
		e2.calculateTotalSalary();
		
		Employee e3 = new CommissionEmployee(); //upcasting
		e3.acceptEmployee(sc);
		e3.toString();
		e3.calculateTotalSalary();
		
		Employee e4 = new BasePlus();  //upcasting
		BasePlus b1 = (BasePlus) e4;   //downcasting
		b1.acceptEmployee(sc);
		b1.toString();
		b1.calculateTotalSalary();
		b1.SalaryAfterIncrement();
		
		
		
		

	}

}
