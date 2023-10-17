package assignment7;

public class ReverseString {

	public static void main(String[] args) {
		String s="SAURABH";
		String rs="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rs=rs+s.charAt(i);
		}
		System.out.println("Original String is "+s);
		System.out.println("Reverse String is "+rs);
		}


	}
