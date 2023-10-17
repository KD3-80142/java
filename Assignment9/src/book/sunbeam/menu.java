package book.sunbeam;

import java.util.*;

public class menu {
	
	public static int MenuDrivern() {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1.Add new book in list.");
		System.out.println("Press 2.Display all books in forward order.");
		System.out.println("Press 3. at book given index -- list.remove(index);");
		System.out.println("Press 4.Check if book with given isbn is in list or not");
		System.out.println("Press 5.Delete all books in list");
		System.out.println("Press 6.Display number of books in list");
		System.out.println("Press 7.Sort all books by price in desc order -- list.sort();");
		System.out.println("Enter your choice = ");
		choice=sc.nextInt();
		return choice;
	}
  

	public static void main(String[] args) {
		List <Book> b=new ArrayList<>();
		
		 int choice=0;
		 
		  
		 do {
			 
		  switch(choice) {
		  case 0:
			  System.out.println("Exit");
			  
			  break;
		  case 1: Book b1=new Book();
		          b1.Accept();
		          b.add(b1);
		       
			break;
			
		  case 2:
			      System.out.println(b); 
			  break;
			  
		  case 3:
			  System.out.println("Enter A loction Do you want remove this book");
			  int index;
			  
			     Scanner sc = new Scanner(System.in); 
			     index=sc.nextInt();
			     for(int i=1; i < b.size();i++)
			     {
			    	if(index==i)
			    		b.remove(index);
			     }
			    	 
			  break;
		  case 4:
			  
			  
			  break;
		  default: System.out.println("Wrong Choice!!!");
		  }	 
			 
		 }while((choice = MenuDrivern())!=0);
		
		 System.out.println("Thank You.. :)");
	}

}
