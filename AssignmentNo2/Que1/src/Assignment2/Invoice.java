/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
*/

package Assignment2;

public class Invoice {
	private String partNo;
	private String partDes;
	private int quantity;
	private double price;
	
	public Invoice() {
		System.out.println("Inside parameterless ctor");
	}
	
	public Invoice(String partNo, String partDes, int quantity, double price) {
		this.partNo = partNo;
		this.partDes = partDes;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	
	public String getPartNo() {
		return partNo;
	}
	
	public void setPartDes(String partDes) {
		this.partDes = partDes;
	}
	
	public String getPartDes() {
		return partDes;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double invoiceAmt() {
		return price * quantity;
	}
}
