package com.sunbeam;

public class Manager implements Emp {
     private double basicSalary;
     private double Allowance;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(double basicSalary, double allowance) {
		super();
		this.basicSalary = basicSalary;
		Allowance = allowance;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getAllowance() {
		return Allowance;
	}
	public void setAllowance(double allowance) {
		Allowance = allowance;
	}
	@Override
	public double getSal() {
		double sal=basicSalary+Allowance;
		return sal;
	}
     public double calcIncentives() {
    	
    	 double incentive=(basicSalary*0.2);
    	 return incentive;
     }
}
