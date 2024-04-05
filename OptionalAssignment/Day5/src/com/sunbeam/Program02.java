package com.sunbeam;

import java.util.Arrays;

public class Program02 {
	public static void swap(int n1, int n2) {
		int temp = n1;
		n1=n2;
		n2=temp;
	}
	
	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		System.out.println("Before swapping");
		System.out.println(Arrays.toString(arr));
		
		swap(arr); //pass by reference
		
		System.out.println("After Swapping");
		System.out.println(Arrays.toString(arr));
		
		
		int n1 = 10;
		int n2 = 20;
		System.out.println("Before Swapping");
		System.out.println("n1: "+n1+",n2: "+n2);
		swap(n1,n2); //pass by value
		System.out.println("After Swapping");
		System.out.println("n1: "+n1+",n2: "+n2);
		
		//the swaping will takes place only in FAR of swap(n1,n2)
		//but in actual main it will remain same/ does shallow copy
		
	}
}
