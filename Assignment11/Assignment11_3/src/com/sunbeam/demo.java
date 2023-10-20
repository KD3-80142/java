package com.sunbeam;



import java.util.Scanner;

interface  Arithmetic {
	double calc(double a,double b);
}
	
	
	public class demo  {
		static void calc(double num1, double num2, Arithmetic op) {
			double result = op.calc(num1, num2);
			System.out.println("Result: "+result);
			}
	
	
	 
	public static void main(String[] args) {
		
		
		System.out.println("Enetr Your choice");
		int choice;
		Scanner sc=new Scanner (System.in);
		System.out.println("0.for exit");
		System.out.println("1.for Substract");
		System.out.println("2.for Add");
		choice=sc.nextInt();
		switch(choice) {
		case 0:System.out.println("Exit");
		 break;
		case 1:
			   System.out.println("Enter your Values:::");
			   double num2=sc.nextDouble();
			   System.out.println("Enter your Values:::");
		       double num3=sc.nextDouble();
		       calc(num2, num3, (x,y)->x-y);
		  break;
		case 2:
			System.out.println("Enter your Values:::");
			   double num=sc.nextDouble();
			   System.out.println("Enter your Values:::");
		       double num1=sc.nextDouble();
			    calc(num, num1, (x,y)->x+y);
	      break;
	      default:System.out.println("Sorry Wrong choice......!");
	      break;
		}
		
		System.out.println("SuccessFully Terminated");
	}

	}
		
	
	
	

	
	