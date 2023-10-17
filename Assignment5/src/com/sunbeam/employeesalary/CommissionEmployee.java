package com.sunbeam.employeesalary;

import java.util.Scanner;

public class CommissionEmployee  extends Employee{
	private int grossSales;
	private double commissionRate;
	
	
	


	public void acceptData()
	{   super.acceptData();
		System.out.println("Please enter the Gross sales in rupees done by employee");
		this.grossSales= new Scanner(System.in).nextInt();
		System.out.println("Please enter the Gross sales in rupees done by employee");
		this.commissionRate= new Scanner(System.in).nextDouble();
		
		
	}


	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public void calculateSalary() {
		System.out.println("The salary of employee is"+this.commissionRate*this.grossSales);
		
	}
	
	
	

}