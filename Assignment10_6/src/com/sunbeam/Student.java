package com.sunbeam;

import java.util.*;

public class Student {
	int rollno;
	String name;
	int marks;
	public Student()
	{
		
	}
	public Student(int rollno, String name, int marks) {
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void acceptData()
	{
		System.out.println("Please enter the Roll no");
		this.rollno = new Scanner(System.in).nextInt();
		System.out.println("Please enter the name");
		this.name = new Scanner(System.in).next();
		System.out.println("Please enter the Marks");
		this.marks = new Scanner(System.in).nextInt();
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	


}
