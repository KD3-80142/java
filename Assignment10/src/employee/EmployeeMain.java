package employee;

import java.util.*;

public class EmployeeMain {
		public  static int Menu(){
			System.out.println("Plese Enter your choice");
			Scanner sc= new Scanner(System.in);

		
		System.out.println("Press 1 for Add");
		System.out.println("Press 2 for delete");
		System.out.println("Press 3 for sort");
		System.out.println("Press 4 for find");
		System.out.println("press 5 for edit");
		int choice;
		choice=sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
	     int choice=0;
	     Scanner sc= new Scanner(System.in);

	     LinkedList<Employee> list = new LinkedList<>();
	     do {
	    	 switch(choice) {
				case 1:
					   Employee b1= new Employee();
					   b1.Accept();
					   list.add(b1);
					   
					break;
				case 2:
					System.out.println("Enter id to delete");
					int empid=sc.nextInt();
					Employee b2 = new Employee();
					if(list.contains(b2)) {
						int index = list.indexOf(b2);
						list.remove();
					}
					  
					
					break;
				case 3:
					System.out.println("Enter id to find");
					int empid1 =sc.nextInt();
					Employee b3 = new Employee();
					b3.setEmpid(empid1);
					if(list.contains(b3)) {
						int index =list.indexOf(b3);
						System.out.println(list.get(index));
					}
					
					
					break;
				case 4:
					class LinkedListComparatoe implements Comparator<Employee>{

						@Override
						public int compare(Employee arg0, Employee arg1) {
							// TODO Auto-generated method stub
							int diff=-(arg0.getEmpid()-arg1.getEmpid());
							return diff;
						}
						
					}
					
					break;
				case 5:
					System.out.println("Enter emp id to be modified: ");
					int id = sc.nextInt();
					Employee key = new Employee();
					key.setEmpid(id);
					int index = list.indexOf(key);
					if(index == -1)
					System.out.println("Employee not found.");
					else {
					Employee oldEmp = list.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.Accept();
					list.set(index, newEmp);
					break;
				
					}
					
				default : System.out.println("Wrong Choice!!!");
				  break;

				}

	     }while((choice=Menu())!=0);
	}
}
	
	
	