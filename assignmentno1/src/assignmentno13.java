import java.util.*;

public class assignmentno13 {
	
	
	public static int menu() {
		int choice;
		System.out.println("Please choose your food iteam");
		System.out.println("Press 1 for Dosa");
		System.out.println("press 2 for Smosa");
		System.out.println("press 3 for Idli");
		System.out.println("press 0 for exxit");
		Scanner obj = new Scanner (System.in);
		choice=obj.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {		
		int choice;
		int iteam;
		int bill=0;
		Scanner sc = new Scanner(System.in);
		//choice=sc.nextInt();
		
		while((choice = menu())!=0) 
		{
			
			switch(choice) {
			
			case 1:  System.out.println("Your selected DOSA  ");
			         System.out.println("Enter Quantity you want");
			         int prize=15; 
			         iteam=sc.nextInt();
			         bill+= prize * iteam;
			         System.out.println("Your Total Bill "+bill);
			         break;
			         
			         
			case 2: 
			 System.out.println("Your selected Smosa  ");
	         System.out.println("Enter Quantity you want");
	      
	         int cost=30;
	         iteam = sc.nextInt();
	         bill+=cost * iteam;
	         System.out.println("Your Total Bill "+bill);
	         break;	
	         
			case 3: 
			 System.out.println("Your selected Idli  ");
	         System.out.println("Enter Quantity you want");
	      
	         int costt=20;
	         iteam = sc.nextInt();
	         bill+=costt * iteam;
	         System.out.println("Your Total Bill "+bill);
	         break;	
	         
			default:
				System.out.println("Wrong choice...");
				break;		
				
			}
		}
		
	}

}
