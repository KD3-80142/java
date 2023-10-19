package com.sunbeam;

import java.util.*;

public class Bookmain {

	public static void main(String[] args) {
		
		Book b1=new Book();
		
		Set<Book> set = new LinkedHashSet<>();
		
		set.add(new Book("1",500.12,"Ruturaj",7));
		set.add(null);
		set.add(null);
		set.add(new Book("2",500.12,"Ruturaj",7));
		set.add(new Book("5",550.12,"Rushiraj",3));
		set.add(new Book("3",500.12,"siddhi",10));
		set.add(new Book("3",500.12,"madhura",10));

			Iterator<Book> itr =set.iterator();
			while(itr.hasNext()) {
				Book e =itr.next();
				System.out.println(e);
			}
		}
	}
  
//without using hashcode its sorted the array
//Without uisng hashcode it accepted duplicate value
//Accept null value only once
//element must implement equals and hashcode method

