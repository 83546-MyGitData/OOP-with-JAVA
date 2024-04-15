package com.sunbeaminfo;

import java.util.*;

public class Student implements Comparable<Student>{
	
	private int rollno;
	private String name;
	private double marks;

	public Student() {
		System.out.println("Parameterless()");
	}
	
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		else if(this==obj)
			return true;
		else if(obj instanceof Student) {
			Student s = (Student) obj;
			return s.rollno == this.rollno;
		}
		return false;
	}
}

