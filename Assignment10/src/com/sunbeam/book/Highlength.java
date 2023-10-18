package com.sunbeam.book;

import java.util.*;

public class Highlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List <String> list =new ArrayList<>();
        list.add("Hubibi come to Sunbeam");
        list.add("Exception in thread main java lang ");
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        String shortestString = Collections.min(list, lengthComparator);
        String longestString = Collections.max(list, lengthComparator);

        System.out.println("Shortest string: " + shortestString);
        System.out.println("Longest string: " + longestString);
	}

}
