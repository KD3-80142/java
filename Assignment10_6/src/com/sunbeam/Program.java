package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Map<Integer, Student> map = new LinkedHashMap<>();
		//linkedHashMap takes only one instance when duplicates are 
		//entered and we can also see it in the display and it doesnot required the 
		//equal and hashCode method for it
		int choice;
		do{
			System.out.println("Please enter the choice ");
			System.out.println("0. Exit ");
			System.out.println("1. Insert Student in map ");
			System.out.println("2. Find Student in map ");
			System.out.println("3. Display Student in map ");
			choice = new Scanner(System.in).nextInt();
		switch (choice) {
			case 1:
				Student s1 = new Student();
				s1.acceptData();
				map.put(s1.getRollno(), s1);
		
				break;
			case 2:
				System.out.println("Please enter Roll no for searching Student");
				int rollno= new Scanner(System.in).nextInt();
				Student s2 = new Student();
				s2 = map.get(rollno);
				System.out.println(s2);
		
				break;
				
			case 3:
				Student s3 = new Student();
				Set <Entry<Integer, Student>> entry=map.entrySet();
				for (Entry<Integer, Student> entry2 : entry) {
					System.out.println("Roll no is:"+entry2.getKey()+"\n Name is :"+entry2.getValue().name+"\n Marks are :"+entry2.getValue().marks); 
					
				}
				break;
			case 0:
				break;

			default:
				System.out.println("Wrong choice");
				break;
	 }
	}while(choice!=0);

	}

}
