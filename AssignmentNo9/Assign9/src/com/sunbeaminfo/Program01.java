package com.sunbeaminfo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		studentList.add(new Student(1, "Pikachu", 80));
		studentList.add(new Student(5, "Doremon", 60));
		studentList.add(new Student(3, "Hattori", 50));
		studentList.add(new Student(2, "Shinchan", 70));
		studentList.add(new Student(4, "Himavari", 90));
		
		System.out.println("Before sorting");
		for (Student std : studentList) {
			System.out.println(std);
		}
		
		Collections.sort(studentList);
		
		System.out.println("After sorting (Natural Ordering)");
		for (Student std : studentList) {
			System.out.println(std);
		}
		
		System.out.println("Sorting based on Student's name");
		
		class StudentNameComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
		Comparator<Student> stdNameComparator = new StudentNameComparator();
		Collections.sort(studentList, stdNameComparator);
		
		for (Student std : studentList) {
			System.out.println(std);
		}
			
			Student student = new Student();
			student.setRollno(4);
			if(studentList.contains(student)) {
				System.out.println("Student Exits");
			}
			else {
				System.out.println("Student not found");
			}
		
	}

}
