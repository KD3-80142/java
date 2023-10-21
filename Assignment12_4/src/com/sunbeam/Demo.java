package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try(FileReader fr = new FileReader("Ruturaj.txt")){
        	try(BufferedReader bff = new BufferedReader(fr)){
        		String line;
        		while((line = bff.readLine())!=null) {
        			System.out.println(line);
        		}
        		
        	}
        	
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
	}

}
