package com.app.fruits;

import java.util.Scanner;

public class Fruits {
	 String color;
	 double weight;
	 String name;
	 boolean isFresh=true;
	
	public Fruits() {
	}

	public Fruits(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	 
	@Override
	public String toString() {
		return "fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + ", taste="+taste()+"]";
	}
	
	public String taste()
	{
		return "no specific test";
	}

     public void AccepetData() {
		 System.out.println("Enter fruit deatils");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter fruit name");
		 name=sc.next();
		 System.out.println("Enter fruit color");
		 color=sc.next();
		 System.out.println("Enter fruit weight");
		 weight=sc.nextDouble();
				 
	 }
     public void disply() {
    	 System.out.println("**************************************************");
    	 System.out.println("Name of fruits:: "+this.name);
    	 System.out.println("Fruit color:: "+this.color);
    	 System.out.println("Fruit weight:: "+this.weight);
    	 System.out.println("**************************************************");
     }
}

