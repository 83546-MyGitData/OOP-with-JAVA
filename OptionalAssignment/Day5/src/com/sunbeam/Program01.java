package com.sunbeam;

import java.util.Arrays;

public class Program01 {
	
	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50};
		// System.out.println(arr1);          It will give address 
		System.out.println(Arrays.toString(arr1));  //it will give value
		
		int arr2[]= {55,22,33,11,44};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr2));
		
		int index = Arrays.binarySearch(arr2, 22);
		System.out.println("Index: "+index);
		
		int arr3[][] = {{11,22,33,},{44,55}};
		System.out.println("For loop");
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println("Multidimenstional Array: "+arr3[i][j]);
			}
		}
		
		System.out.println("For each loop");
		for(int[]row:arr3)
			for(int values: row)
				System.out.println("Values: "+values);
		
	}

}
