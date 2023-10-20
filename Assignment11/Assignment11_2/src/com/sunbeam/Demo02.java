package com.sunbeam;

import java.util.function.Predicate;

public class Demo02 {
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}
	
	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant","Ruturaj" };
		// call countIf() to count number of strings have length more than 6 -- using anonymous inner class
		int cnt = countIf(arr,ele -> ele.length()>6);
		System.out.println("Result: " + cnt); // 2
		// call countIf() to count number of strings have length more than 6 -- using lambda expressions
		}

}
