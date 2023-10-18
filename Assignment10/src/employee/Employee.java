package employee;

import java.util.Scanner;

import com.sunbeam.book.Book;

public class Employee {
     private int empid;
     private String name;
     private int salaray;
    public Employee() {
		// TODO Auto-generated constructor stub
	} 
	public Employee(int empid, String name, int salaray) {
		super();
		this.empid = empid;
		this.name = name;
		this.salaray = salaray;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaray() {
		return salaray;
	}
	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salaray=" + salaray + "]";
	}
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(this.empid == other.empid)
				return true;
		}
		return false;
	}
	  public void Accept() {
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter Employee id");
		 empid=sc.nextInt();
		 System.out.println("Enter Employee name");
		 name=sc.next();
		 System.out.println("Enter Employee Salary");
		 salaray=sc.nextInt();
	  }
	}












