package Que;

import java.util.*;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
		
	}
	
	public Student(int rollno, String name, String city, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.setCity(city);
		this.setMarks(marks);
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + getCity() + ", marks=" + getMarks() + "]";
	}

	@Override
	public int compareTo(Student o) {
			return(this.rollno - o.rollno);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	

}
