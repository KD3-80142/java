package com.sunbeam.employeesalary;

import java.util.Scanner;

abstract public class Employee{
private int ssn;
private String firstName;
private String lastName;

public abstract void calculateSalary();
public void acceptData()
{
	System.out.println("Please Enter the First Name of Employee");
	this.firstName= new Scanner(System.in).next();
	System.out.println("Please Enter the Last Name of Employee");
	this.lastName= new Scanner(System.in).next();
	System.out.println("Please Enter the Social Security Number of Employee");
	this.ssn= new Scanner(System.in).nextInt();

}
@Override
public String toString() {
	return "Employee [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}


}
