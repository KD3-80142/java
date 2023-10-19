package com.sunbeam;

import java.util.*;
import java.util.Map.Entry;





public class mainBook {
	public  static int menu() {
		int choice;
		System.out.println("PRESS 1 insert in map");
		System.out.println("PRESS 2 find in map");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Map<String,Book> map = new HashMap<>();
		Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
        switch(choice) {
        case 1:  Book b1 = new Book();
                 b1.Accept();
                 map.put(b1.getIsbn(),b1);
            break;
        case 2:  
        	String isbn = sc.next();
            Book f = map.get(isbn);
          
            System.out.print("Enter isbn ");

            if(f == null)
            	System.out.println("Pin code Not found.");
            else
            	System.out.println("Pin code of " + f);
            break;
        case 3: Set<Entry<String,Book>>entries = map.entrySet();
				for (Entry<String, Book> entry : entries) 
				{
					System.out.println("For isbn = "+entry.getKey()+"--->"+"Book Details = "+entry.getValue());
					System.out.println();
				}
        		break;
        default:System.out.println("Wrong Choice!!!!");
        		break;
        }
        }while( (choice = menu() )!=0);
	}

}



//no need for for equals and hashcode
