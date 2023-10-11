package com.app.fruits;

import java.util.Scanner;

public class FruitBasket 
{
	
	
	public static int menu() {
		int choice;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your choice here");
	    System.out.println("1.fro Apple");
	    System.out.println("2.fro mango");
	    System.out.println("3.fro Orange");
	    System.out.println("4. Display names of all fruits in the basket");
	    System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
	    System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
	    System.out.println("7. Mark a fruit as stale");
	    System.out.println("8. Mark all sour fruits stale (optional)");
	    System.out.println("0.fro Exit");
	    choice=sc.nextInt();
	     return choice;
	}

	  public static void main(String[] args) {
		  Fruits f = new Fruits();
		  System.out.println("Enter Bucket size");
		  int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int choice;
	    int counter=0;
		Fruits[]basket=new Fruits[n];
		while(( choice= menu()) != 0)
	{
		switch(choice) 
		{
		case 1: 
			 if(counter<n) 
			 {
				basket[counter]=new apple("Apple", "Red",10);	
				System.out.println("apple added");
				counter++;
			 }	
			 else
				 System.out.println("Basket is full!!!");
					break;	
		
		case 2: 
			 if(counter<n) 
			 {
				basket[counter]=new Mango("Mango", "yellow",15);	
				System.out.println("mango added");
				counter++;
			 }	
			 else
				 System.out.println("Basket is full!!!");
					break;
		case 3: 
			 if(counter<n) 
			 {
				basket[counter]=new Orange();
				f.AccepetData();
				System.out.println("Orange added");
				counter++;
			 }	
			 else
				 System.out.println("Basket is full!!!");
					break;
		 case 4:
		    	 for(int i=0;i<counter;i++)
		    	 {
		    		 
		    		 System.out.println("Name = "+basket[i].getName());
		    		 
		    	 }
		    	 System.out.println("**************************************************");
		    	 break;
		    	 
	    case 5:
		    	 for(int i=0;i<counter;i++)
		    	 {
		    		basket[i].disply();
		    	 }
		     
		    	 break;
		   }
	  }
  }	 
}

