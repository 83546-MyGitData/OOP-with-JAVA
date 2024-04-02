/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/

import java.util.Scanner;

public class Numbers{

public static void main(String[] args) {
	
	int num;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	num = sc.nextInt();
	
	System.out.println("Given Number: "+num);
	System.out.println("Binary Number: "+Integer.toBinaryString(num));
	System.out.println("Ocatal Number: "+Integer.toOctalString(num));
	System.out.println("HexaDecimal Number: "+Integer.toHexString(num));
	
}
}

