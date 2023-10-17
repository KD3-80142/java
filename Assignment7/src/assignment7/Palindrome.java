package assignment7;

public class Palindrome {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("BOB");

		StringBuffer str2 = str.reverse();
		
		if(str2 == str)
		{
			System.out.println("It is a Pallindrome!!!");
		}
		else
		{
			System.out.println("Not a Pallindrome!!!");
		}
	}

}

