package com.sunbeam;

import java.util.Scanner;

public class DrivingCost {
	int km;
	int tikit;
    int fee;
    int toll;
    int avg;
    int result;
    int pet;
    int result1;
    int people;
	public DrivingCost() {
		this.km = 100;
		this.tikit = 70;
		this.fee = 60;
		this.toll = 80;
		this.avg=12;
		this.pet=106;
		this.people=1;
	}
	public void accept() {
		System.out.println("Enter your information here ");
		System.out.println("----------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter miles driven per day = ");
		km=sc.nextInt();
		System.out.print("Enter Cost per gallon of gasoline = ");
		pet=sc.nextInt();
		System.out.print("Enter Average miles per gallon = ");
		avg=sc.nextInt();
		System.out.print("Enter Parking fees per day = ");
		fee=sc.nextInt();
		System.out.print("Enter Tolls per day = ");
		toll=sc.nextInt();
		System.out.print("How many people can seat in your car = ");
		people=sc.nextInt();
		
		
	}
	public void ClaculateCost() {
		this.result=(km/avg)*pet+toll+fee;
	}
	public void ClaculateCostPooling() {
		this.result1=((km/avg)*pet+toll+fee)/people;
	}
	 public void display() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Total money Spend on Using Car = "+ result);
		System.out.println("When you used Car Pooling method = "+result1);
		System.out.println("You save money using car pooling = "+(result - result1));
	}
	
    
}
