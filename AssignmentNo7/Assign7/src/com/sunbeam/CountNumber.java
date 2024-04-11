package com.sunbeam;

import java.util.*;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String s = sc.nextLine();
		
		String arr[] = s.split(" ");
		for(String str : arr) {
			System.out.println(str);
		}
		System.out.println(arr.length);
		
		int length = s.length();
		System.out.println("The length of string "+s+" is "+length);
		
		
		String trimed = s.trim();
		System.out.println("Entered String: "+s);
		System.out.println("Trimmed String: "+trimed);
	}

}
