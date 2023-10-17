package com.sunbeam.employeesalary;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	int hourlyWage;
	int hoursWorked;
	
	
	public void calculateSalary()
	{
		if(this.hoursWorked <=40)
			System.out.println("Salary is"+hourlyWage*hoursWorked);
		else if(this.hoursWorked>40)
			System.out.println("Salary is"+(40+this.hourlyWage+(this.hoursWorked-40)*this.hourlyWage*1.5));
			
			
	}
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Please enter no of hours worked");
		this.hoursWorked = new Scanner(System.in).nextInt();
		System.out.println("Please enter  hourly wage in rupees");
		this.hoursWorked = new Scanner(System.in).nextInt();
	}
	


	@Override
	public String toString() {
		return "HourlyEmployee [hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked + ", toString()="
				+ super.toString() + "]";
	}
	

}