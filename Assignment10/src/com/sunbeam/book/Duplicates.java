package com.sunbeam.book;

import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Collection<String> c = new ArrayList<>();
//		Collection<String> c = new HashSet<>();
//		Collection<String> c = new LinkedHashSet<>();
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}
