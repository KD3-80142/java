package com.sunbeam.main.date;

import java.util.Scanner;

class Program 
{
	int hours;
	int minute;
	
	
	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Program(int hours, int minute) {
		super();
		this.hours = hours;
		this.minute = minute;
	}

	void acceptTime() {
		System.out.println("Enter time::");
		Scanner sc = new Scanner(System.in);
		this.hours=sc.nextInt();
		this.minute =sc.nextInt();
	}
	void disply() {
		System.out.println("Current Time is "+hours + ":" +minute);
	}

}
