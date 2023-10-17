package com.sunbeam;

import java.util.Arrays;

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students [] arr= new Students[5];
		arr[0]=new Students(1,"Rutruaj","Kolhapur",503);
		arr[1]=new Students(5,"Rushi","Ashta",590);
		arr[2]=new Students(3,"Harshu","Kolhapur",503);
		arr[3]=new Students(9,"Siddhi","Raigad",493);
		arr[4]=new Students(7,"Ruturaj","Pune",400);
		
		System.out.println("Befroe sort");
		for (Students students : arr) {
			System.out.println(students);
		}
		Arrays.sort(arr);
		System.out.println("After sort");
		for (Students students : arr) {
			System.out.println(students);
		}
	}

}

