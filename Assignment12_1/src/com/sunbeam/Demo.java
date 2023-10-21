package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class Demo {
	
	public static int MenuDrivern() {
		
		int choice;
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1.Save books in ﬁle and load books from ﬁle.");
		System.out.println("Press 2.DataOutputStream.");
		System.out.println("Press 3.DataInputStream");
		System.out.println("Press 0.for exit");
		
		choice=sc.nextInt();
		return choice;
	}
  public static void main(String[] args) {
	  List <Book> b1 = new ArrayList<>();
	
	
	int choice;
	while((choice=MenuDrivern())!=0) {
		switch(choice) {
		case 0 :
			System.out.println("Exit.....");
			break;
		case 1 :
			Book b2 =new Book();
			b2.Accept();
		       b1.add(b2);
		break;	
		case 2 :
			    try(FileOutputStream fout = new FileOutputStream("Book.txt")){
			    	try(DataOutputStream oout = new DataOutputStream(fout)){
			    	  for (Book b : b1) {
			    		  oout.writeUTF(b.getIsbn());
			    		  oout.writeDouble(b.getPrice());
			    		  oout.writeUTF(b.getAuthorName());
			    		  oout.write(b.getQuantity());
						
					}
			    	}
			    	System.out.println("Books Are Saved.......!");
			    }
			    catch (Exception e) {
					e.printStackTrace();
				}
			break;
		case 3:
			     try(FileInputStream fin = new FileInputStream("Book.txt")){
			    	 try(DataInputStream din = new DataInputStream(fin)){
			    		 while(true) {
			    			 Book b = new Book();
			    			 b.setIsbn(din.readUTF());
			    			 b.setPrice(din.readDouble());
			    			 b.setAuthorName(din.readUTF());
			    			 b.setQuantity(din.read());
			    			 System.out.println(b);
			    		 }
			    	 }
			     }
			     catch (EOFException e) {
						// do nothing
					}
			     catch (Exception e) {
					// TODO: handle exception
			    	 e.printStackTrace();
				}
			        
			break;
		
		
			default:System.out.println("Worng choice....!");
		    break;
		}

	}
	
  }
}
