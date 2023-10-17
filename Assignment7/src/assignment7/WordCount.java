package assignment7;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		
		int count=0;
		String s1 = "Saurabh is a good boy";
		System.out.println(s1);
		
		
		StringTokenizer str = new StringTokenizer(s1,":/.",true);
		
		
		while(str.hasMoreTokens()) {
			String token = str.nextToken();
			count++;
			System.out.println(token);
		}
		
		System.out.println("Total Strings = "+count);

	}

}