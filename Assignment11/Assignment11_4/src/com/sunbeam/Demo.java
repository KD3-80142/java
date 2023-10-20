package com.sunbeam;

interface Check<T>{
	boolean comapre(T a,T b);
}

public class Demo {
	static<T> int countIf(T[]arr,T key,Check<T>c) {
		int  cnt =0;
		for (T t : arr) {
			if(c.comapre(t, key))
				cnt++;
		}
		return cnt;
	}
public static void main(String[] args) {
	Integer [] arr = {44, 77, 99, 22, 55, 66};
	Integer key = 50;
	int cnt = countIf(arr, key, (x,y)-> x < y);//50 greather than
	int cnt2 = countIf(arr, key, (x,y)-> x > y);
	System.out.println("Count more than = "+ cnt+ " With key is =" +key);
	System.out.println("Count less than = "+ cnt2+ " With key is =" +key);
}
}
