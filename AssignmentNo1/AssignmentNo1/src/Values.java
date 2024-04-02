/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods*/

import java.util.Scanner;

public class Values {

	public static void main(String[] args) {
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		if(sc.hasNextDouble()) {
			num1 = sc.nextDouble();
		}else {
			System.out.println("ERROR: You have entered wrong input. Please enter the double value");
			sc.close();
		return;
		}
		
		System.out.println("Enter 2nd Number: ");
		if(sc.hasNextDouble()) {
				num2 = sc.nextDouble();
		}else{
				System.out.println("ERROR: You have entered wrong input. Please enter the double value");
				sc.close();
				return;
		}
		double avg = (num1+num2)/2;
		System.out.println("The Average : "+avg);
	}

}
