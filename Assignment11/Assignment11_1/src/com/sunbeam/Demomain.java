package com.sunbeam;

public class Demomain {
	public static void main(String[] args) {
		Emp[] arr=new Emp[3];
		arr[0] = new Manager(200.50,300.00);
		arr[1] = new Labor(301.12,40.5);
		arr[2] = new Clerk(2500.25);
		
		double total = Emp.calcTotalIncome(arr);
		System.out.println("Total Income" + total);
	}

}
