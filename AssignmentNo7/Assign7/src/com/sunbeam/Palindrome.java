/*Write a java code to check string is palindrome.*/

package com.sunbeam;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.next();
		
		String rev = "";
		char ch;
		
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			rev = ch + rev;
		}
		
		if(s.equals(rev)) {
			System.out.println(s+" :string is palindrome");
		}else {
			System.out.println(s+":String is not palindrome");
		}
		
	}

}
