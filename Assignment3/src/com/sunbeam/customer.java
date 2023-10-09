package com.sunbeam;

import java.util.Scanner;

public class customer {
	int accNo;
	int bal;
	int totalIteam;
	int Allowcradit=40000;
	int craditApllied;
	int newBal;
	public customer() {
		super();
		this.accNo = 0;
		this.bal = 0;
		this.totalIteam = 0;
		Allowcradit = 40000;
		this.craditApllied = 0;
	}
	
	public void accpet() {
		System.out.println("Enter Customer Deatils");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter account number ");
		accNo=sc.nextInt();
		System.out.println("Enter balance at the beginning of the month ");
		bal=sc.nextInt();
		System.out.println("Enter total of all items charged by the customer this month");
		totalIteam=sc.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this month");
		craditApllied=sc.nextInt();
	}
	public void calculateCredit() {
		newBal = bal+ totalIteam - craditApllied;
		if(newBal>Allowcradit) {
		    
		         System.out.println("Credit limit exceeded.....::::");
		}
			  
	}
	
	
	public void display() {
		System.out.println("Account Number:: "+accNo);
		System.out.println("Beging Balence:: "+bal);
		System.out.println("totalIteam:: "+totalIteam);
		System.out.println("Allowcradit:: "+Allowcradit);
		System.out.println("craditApllied:: "+craditApllied);
		System.out.println("New BAl:: "+newBal);
	}
	

}
