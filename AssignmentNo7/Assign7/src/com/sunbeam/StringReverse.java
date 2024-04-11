package com.sunbeam;

import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("Enter a String: ");
		s = sc.next();
		
		String rev = " ";
		char ch;
		
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			rev = ch + rev;
		}
		
		System.out.println("Reverse: "+rev);
		
		
		
		

	}

}
