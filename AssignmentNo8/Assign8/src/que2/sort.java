package que2;

import java.util.Comparator;

public class sort {
	static <T>void selectionSort(T [] arr,Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++)
		for(int j=i+1; j<arr.length; j++)
		if(c.compare(arr[i], arr[j])>0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
	
	public static void main(String[] args) {
		class Select implements Comparator<Integer>
		{
			@Override
			public int compare(Integer o1, Integer o2) {
				int diff = Integer.compare(o1, o2);
				
				return diff;
			}
		}
		
		Select s = new Select();
		Integer[] arr1 = {10, 30, 70, 80, 40, 50, 20};
		System.out.println("before sort");
		for (Integer integer : arr1) {
			System.out.println(integer);
			
		}
		selectionSort(arr1,s);
		System.out.println("after sort");
		for (Integer integer : arr1) {
			System.out.println(integer);
			
		}
}
}
