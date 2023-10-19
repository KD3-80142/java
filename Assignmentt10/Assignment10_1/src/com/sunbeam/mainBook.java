package com.sunbeam;

import java.util.*;

public class mainBook {

	public static void main(String[] args) {
		Book b1=new Book();
		Set<Book> set = new HashSet<>();
		set.add(new Book("1",500.12,"Ruturaj",7));
		set.add(null);
		set.add(new Book("2",500.12,"Ruturaj",7));
		set.add(new Book("5",550.12,"Rushiraj",3));
		set.add(new Book("3",500.12,"siddhi",10));
		set.add(new Book("3",500.12,"madhura",10));
//		for (Book book : set) {
//			System.out.println(book);
			Iterator<Book> itr =set.iterator();
			while(itr.hasNext()) {
				Book e =itr.next();
				System.out.println(e);
			}
		}
	}
  //Without hascode it will take duplicate value
 //without hascode it will print output as we give 
 //withou using  equals to methd it will take duplicate values


