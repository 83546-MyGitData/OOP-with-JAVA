import java.util.Scanner;

public class Foodm56enu 
{

	public static void main(String[] args) 
	{
		int choice;
		double totalamount = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Samosa");
			System.out.println("2. Kachori");
			System.out.println("3. Misal Pav");
			System.out.println("4. Vada Pav");
			System.out.println("5. Idli");
			System.out.println("6. Dosa");
			System.out.println("7. Pohe");
			System.out.println("8. Upama");
			System.out.println("9. Tea");
			System.out.println("10. Coffe");
			System.out.println("11. Generate Bill");
			System.out.print("ENTER YOUR CHOICE : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					double price = 15;
					int q;
					System.out.println("SAMOSA - 15 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 2:
				{
					double price = 15;
					int q;
					System.out.println("Kachori - 15 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 3:
				{
					double price = 60;
					int q;
					System.out.println("Misal Pav - 60 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 4:
				{
					double price = 25;
					int q;
					System.out.println("Vada Pav - 25 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 5:
				{
					double price = 30;
					int q;
					System.out.println("Idli - 30 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 6:
				{
					double price = 40;
					int q;
					System.out.println("Dosa - 40 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 7:
				{
					double price = 20;
					int q;
					System.out.println("Pohe - 20 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 8:
				{
					double price = 20;
					int q;
					System.out.println("Upama - 20 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 9:
				{
					double price = 10;
					int q;
					System.out.println("Tea - 10 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 10:
				{
					double price = 15;
					int q;
					System.out.println("Coffe - 15 Rs.");
					System.out.print("Enter Quantity : ");
					q = sc.nextInt();
					totalamount = totalamount + (q * price); 
					
				}
				break;
				case 11:
				{
					System.out.println("TOTAL BILL - " + totalamount);
					choice = 0;
				}
				break;
				default :
					System.out.println("WRONG CHOICE ........");
					break;
				
			}
			
			
		}while(choice != 0);


	}

}
