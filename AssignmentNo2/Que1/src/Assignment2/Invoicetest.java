/*calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/

package Assignment2;

import java.util.Scanner;

public class Invoicetest {
	
	public static void main(String[] args) {
		
		String partDes;
		int quantity;
		double price;
		String partNo;
		double invoice = 0;
		int a;
		
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the part name - ");
			partDes = sc.next();

			System.out.print("Enter the part number - ");
			partNo = sc.next();

			System.out.print("Enter the quantity - ");
			quantity = sc.nextInt();
			if (quantity < 0) {
				quantity = 0;
			}

			System.out.print("Enter the price - ");
			price = sc.nextDouble();
			if (price < 0) {
				price = 0.0;
			}

			Invoice i = new Invoice(partNo, partDes, quantity, price);
			invoice = i.invoiceAmt();

		
		System.out.println("The invoice for your order is - " +invoice);
	}

}
