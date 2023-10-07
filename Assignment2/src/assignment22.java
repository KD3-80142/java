import java.util.Scanner;

public class assignment22 {
	   
	String FirstName;
	String LastName;
	Double Salary;
	Double RiseSal;
	public assignment22(String firstName, String lastName, Double salary) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Salary = salary;
	}


	public assignment22() {
		this.FirstName="";
		this.LastName="";
		this.Salary=00.00;
	}
	

	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public Double getSalary() {
		return Salary;
	}


	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	void accept() {
		System.out.println("Enter Employee Deatils::-");
		Scanner sc= new Scanner(System.in);
		System.out.println("Employee First Name ");
		FirstName =sc.next();
		System.out.println("Employee Last Name ");
		LastName =sc.next();
		System.out.println("Employee Salary ");
		Salary=sc.nextDouble();
		if(Salary<0) {
		        this.setSalary(0.0);    
		}
	}
	void Calculate() {
		
		Salary = Salary * 12;
		RiseSal = Salary*1.1;
	}
	void Display() {
		System.out.println("Employee Name:: " +FirstName+" "+LastName);
		
		System.out.println("Annual Salary:: "+Salary);
		System.out.println("Annual salary with Rise 10% = " + RiseSal);
	}

}
   










