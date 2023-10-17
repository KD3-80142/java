package assignment7;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		String arr[]= {"Saurabh","sandesh","karad","Sunbeam"};
		String arr1[]={"Sunbeam","sandesh","karad","Saurabh"};
		
		

	

	for(int j=0;j<3;j++)
	{
		for(int k=0;k<3;k++)
		{
			if(arr[j].equals(arr1[k]))
			{
				System.out.println("Duplicate String found = " +arr[k]);
			}
		}
	}
	

 }
}