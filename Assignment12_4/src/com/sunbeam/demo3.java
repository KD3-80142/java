package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		System.out.println("Enter four string");
		Scanner sc = new Scanner(System.in);
       try(FileWriter fi= new FileWriter("Ruturaj.txt")){
    	   try(BufferedWriter bwr = new BufferedWriter(fi)){
    		   for(int i=1; i<=4; i++) {
    			   System.out.println("String....!");
    			   String line = sc.nextLine();
    			   bwr.write(line);
    			   bwr.newLine();
    			   }
    	   }
    	   
       }catch (Exception e) {
		// TODO: handle exception
	}		
  System.out.println("Ter.....");
}
}
