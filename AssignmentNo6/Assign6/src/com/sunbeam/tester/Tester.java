package com.sunbeam.tester;

import com.sunbeam.exceptions.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg;
		
		try {
			System.out.print("Please enter the message: ");
			msg = sc.nextLine();
			if(msg.length() > 80) {
				throw new ExceptionLineTooLong("The string is too long",msg.length());
			}else {
				System.out.println("The entered string is in limit");
				System.out.println("The entered message: "+msg);
			}
	} 
		catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("Program done successfully");
		}

}
}