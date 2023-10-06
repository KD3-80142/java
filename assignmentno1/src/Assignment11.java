import java.util.*;
public class Assignment11 {

	public static void main(String[] args) {
		int num;
	
		System.out.print("Enter a number:: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter Number: "+num);
		
		System.out.println("Binary equivalent : "+Integer.toBinaryString(num));
		System.out.println("Octal equivalent : "+Integer.toOctalString(num));
		
		System.out.println("Hexadecimal equivalent : "+Integer.toHexString(num));


	}

}
