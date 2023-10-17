package com.sunbeam;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		try {
		String Sstring = sc.next();
		ExceptionLineTooLong e1 = new ExceptionLineTooLong(Sstring.length(), Sstring);
		e1.IsEqual();
		
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
		}
		}

}