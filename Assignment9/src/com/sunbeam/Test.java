package com.sunbeam;

public class Test {
	static <T extends Number> T findMin(T[] arr) {
	     T min = arr[0];
	     for(int i =0;i<arr.length;i++) {
	    	 if(min.doubleValue()>arr[i+1].doubleValue()) {
	    		 min=arr[i+1];
	    	 }
	    	 
	     }
	     return min;
		}

		static void main(String[] args) {
			Integer[] arr1 = { 22, 55, 77, 11, 33 };
			Integer min1 = findMin(arr1);
			Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
			Double min2 = findMin(arr2);
			}
}
