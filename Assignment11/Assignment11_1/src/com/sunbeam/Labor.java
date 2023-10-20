package com.sunbeam;

public class Labor implements Emp {
	private double  hours;
	private double rate;
	
	public Labor() {
		// TODO Auto-generated constructor stub
	}
	

	public Labor(double hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	@Override
	public double getSal() {
		double sal=hours*rate;
		return sal;
	}
	@Override
	public double calcIncentives() {
		double incentive;
		if(hours>300)
		 {
			incentive = ((hours*rate)*0.05);
			 return incentive;
		 }
		else
			return 0;
			     
	}

}
