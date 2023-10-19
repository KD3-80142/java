package com.sunbeam;

import java.util.*;

public class Bookmain {

	public static void main(String[] args) {
		
		Book b1=new Book();
		
		Set<Book> set = new TreeSet<>();
		
		set.add(new Book("2",500.12,"Ruturaj",7));

		set.add(new Book("2",777.12,"Ruturaj",8));
		set.add(new Book("5",555.12,"Rushiraj",3));
		set.add(new Book("3",500.12,"siddhi",10));
		set.add(new Book("1",925.12,"madhura",11));
//        set.add(null);
			Iterator<Book> itr =set.iterator();
			while(itr.hasNext()) {
				Book e =itr.next();
				System.out.println(e);
			}
		}
	}
  
//treeset dose not Accept null value
//Not accepted duplicate value
// sotring 


