package com.sunbeam.employeesalary;

public class Program01 {

	public static void main(String[] args) {
		
		Employee employee= new SalariedEmployee();
		employee.acceptData();
		employee.calculateSalary();
		System.out.println(employee);
		
		Employee employee1 = new HourlyEmployee();
		employee1.acceptData();
		employee1.calculateSalary();
		System.out.println(employee);
		
		Employee employee2 = new CommissionEmployee();
		employee2.acceptData();
		employee2.calculateSalary();
		System.out.println(employee);
		
		Employee employee3 = new BasePlusCommissionEmployee();
		employee3.acceptData();
		employee3.calculateSalary();
		
		System.out.println(employee);
		BasePlusCommissionEmployee base = (BasePlusCommissionEmployee) employee3;
		base.currentPayPeriod();
		
		

	}

}