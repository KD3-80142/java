package com.sunbeam.employeesalary;

import java.util.Scanner;

public class BasePlusCommissionEmployee  extends Employee{

private double grossSales;
private double commissionRate;
private double baseSalary;

	@Override
	public void calculateSalary() {
		System.out.println("The salary of the employee is"+(commissionRate*grossSales)+baseSalary);
		
	}
	public void acceptData()
	{	
		super.acceptData();
		System.out.println("Please enter the Gross sales in rupees");
		this.grossSales = new Scanner(System.in).nextDouble();
		System.out.println("Please enter the Commission Rate ");
		this.commissionRate = new Scanner(System.in).nextDouble();
		System.out.println("Please enter the baseSalary");
		this.baseSalary = new Scanner(System.in).nextDouble();
	}
	
	public void currentPayPeriod()
	{
		this.baseSalary = this.baseSalary *1.1;
		System.out.println("The salary of the employee as per current pay period is"+(commissionRate*grossSales)+baseSalary);
		
	}
	
	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}
	public void displayData()
	{
		
		System.out.println("The gross sale of Employee is"+this.grossSales);
		System.out.println("The Commission Rate of Employee is"+this.commissionRate);
		System.out.println("The Base salary of Employee is"+this.baseSalary);
	}

}