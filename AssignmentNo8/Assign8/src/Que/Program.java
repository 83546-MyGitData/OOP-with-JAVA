/*Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
display students
1. sorted on their city (asc)
2. sorted on their on marks (desc)
3. sorted on their on name (asc)*/

package Que;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student arr[] = new Student[5];
		arr[0] = new Student(1,"Shinchan","Kolhapur",80);
		arr[1] = new Student(4,"Doremon","Satara",70);
		arr[2] = new Student(2,"Pikachu","Goa",90);
		arr[3] = new Student(5,"Tom","Mumbai",50);
		arr[4] = new Student(3,"Jerry","Kolhapur",70);
		
		System.out.println("List of Students Before Sorting");
		for(Student student: arr)
			System.out.println(student);
		
		int choice;
		do {
			System.out.println("Press 0 : Exit");
			System.out.println("Press 1 : Sort students based on cities (Ascending)");
			System.out.println("Press 2 : Sort Students based on their marks(Descending order)");
			System.out.println("Press 3 : Sort Students based on their names(Ascending order)");
			System.out.print("Please enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0: 
				System.out.println("_________THANK YOU_________");
				break;
				
			case 1: //Sort students based on cities (Ascending)
			{
				class StudentCityComp implements Comparator<Student>{
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}
			}
				Comparator<Student> studentCitycomp = new StudentCityComp();
				
				Arrays.sort(arr, studentCitycomp);
				System.out.println("After sorting students based on cities (Ascending)");
				for(Student student: arr)
					System.out.println(student);
				System.out.println("***************************************************");
			}
			break;
			
			case 2: //Sort Students based on their marks(Descending order)
			{
				class StudentMarksComp implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						int value = Double.compare(o2.getMarks(), o1.getMarks());
						return value;
					}
				}
				Comparator<Student> studentMarkscomp = new StudentMarksComp();
				
				Arrays.sort(arr,studentMarkscomp);
				System.out.println("After sorting Students based on their marks(Descending order)");
				for(Student student : arr)
					System.out.println(student);	
				System.out.println("******************************************************");
			}
			break;
			
			case 3: //Sort Students based on their names(Ascending order)
			{
				class StudentNameComp implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					}
				}
				Comparator<Student> studentNamecomp = new StudentNameComp();
				
				Arrays.sort(arr, studentNamecomp);
				System.out.println("After sorting Students based on their names(Ascending order)");
				for(Student student : arr)
					System.out.println(student);
				System.out.println("*******************************************************");
			}
			break;
			
			default: 
				System.out.println("ERROR: Incorrect Choice!! Please enter correct choice..");
				break;
				
			}
		}while(choice!=0);
		
	}
}
