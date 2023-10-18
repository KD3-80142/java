package com.sunbeam.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class menu {
	public static int MenuDrivern() {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1.Add new book in list.");
		System.out.println("Press 2. Display all books in forward order using random access");
		System.out.println("Press 3. Search a book with given isbn (hint - indexOf())");
		System.out.println("Press 4.Delete a book at given index.");
		System.out.println("Press 5.Delete a book with given isbn.");
		System.out.println("Press 6.Reverse the list (hint - Collections.reverseList())");
		System.out.println("Enter your choice = ");
		choice=sc.nextInt();
		return choice;
	}
  

	public static void main(String[] args) {
		List <Book> list=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		Book b1;
		 int choice=0;
		 
		  
		 do {
			 
		  switch(choice) {
		  case 0:
			  System.out.println("Exit");
			  
			  break;
		  case 1: 
			  	  b1  = new Book();
		          b1.Accept();
		          list.add(b1);
		          if(list.contains(b1)) {
		         int idx =list.indexOf(b1);
		          Book bk =new Book();
		          bk=list.get(idx);
		          bk.setQuantity(b1.getQuantity()+1);
		          }
		          else
		        	  list.add(b1);
		       
			break;
			
		  case 2:
			    
			     for(int i=0;i<list.size();i++) {
			    	 b1=list.get(i);
			      System.out.println(b1); 
			      }
			  break;
			  
		  case 3:
			 Book b2= new Book();
			 System.out.println("Enetr isbn");
			 
			 String index =sc.next();
			 if(list.contains(b2))
                System.out.println("Index Found");
			 else
				 System.out.println("Index not found");
			  break;
		  case 4:
//              Book b3 =new Book();
              System.out.println("Enter the index that you delete book");
               int ind;
               ind=sc.nextInt();
               if(ind<list.size()) {
               list.remove(ind);
               }
			  
			  break;
		  case 5:
			  Book b3=new Book();
			  System.out.println("Enetr isbn no");
			  String bn =sc.next();
			  b3.setIsbn(bn);
			  if(list.contains(b3))
			  {
				  int index2 = list.indexOf(b3);
				  list.remove(index2);
			  }			
			  break;
		  case 6:
			  Collections.reverse(list);
			System.out.println("Reveresed List: " + list);
			
			     
			  break;
		  default: System.out.println("Wrong Choice!!!");
		  }	 
			 
		 }while((choice = MenuDrivern())!=0);
		
		 System.out.println("Thank You.. :)");
	}

}
