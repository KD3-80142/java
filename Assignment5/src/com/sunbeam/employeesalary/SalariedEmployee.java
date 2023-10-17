package com.sunbeam.employeesalary;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
double weeklySalary;

public void acceptData()
{	
	super.acceptData();
	System.out.println("Please the the Weekly salary");
	this.weeklySalary= new Scanner(System.in).nextDouble();
}
@Override
public void calculateSalary() {
	System.out.println("Monthly salary of employee is"+weeklySalary*4);
	
}
@Override
public String toString() {
	return "SalariedEmployee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
}



}