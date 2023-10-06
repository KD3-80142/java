import java.util.Scanner;

public class assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row for star pattern:: ");
		 row=sc.nextInt();      
		
		for (i=0; i<row; i++)   
		{  
	     
		for (j=row-i; j>1; j--)   
		{  
		
		System.out.print(" ");   
		}   
	  
		for (j=0; j<=i; j++ )   
		{   
		 
		System.out.print(" *");   
		}   
		
		System.out.println(" ");   
		}  

		
	  
		for ( i= 1; i<= row-1; i++)  
		{  
		for ( j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=row-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  
	}

}
