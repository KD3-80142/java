package com.sunbeam;

import java.util.Scanner;

public class Box <T extends Employee>{
   private T obj;

     public T getObj() {
	   return obj;
}

     public void setObj(T obj) {
	    this.obj = obj;
}
     
    	public double getSalary(T obj) {
    		return obj.CalculateSal();
    	}
     
     
     
   
    }  





class Person
{
private String Name;
Scanner sc = new Scanner(System.in);
public Person()
{
this.Name = "";
}
public Person(String Name)
{
this.Name = Name;
}
void setName(String name)
{
this.Name = name;
}
String getName()
{
System.out.println("Enter Name = ");
this.Name = sc.nextLine();
return this.Name;
}
public void accpetPerson()
{
System.out.println("Enter Name = ");
this.Name = sc.next();
}
public void displayPerson()
{
System.out.println("Name = "+this.Name);
}
}

class Employee extends Person
{
private int Empid;
private double Salary;

public Employee()
{

}
public Employee(int Empid,double Salary,String Name)
{
super(Name);
this.Empid=Empid;
this.Salary=Salary;
}

public int getEmpid() {
return Empid;
}

public void setEmpid(int empid) {
Empid = empid;
}

public double getSalary() {
return Salary;
}

public void setSalary(double salary) {
Salary = salary;
}

public void acceptEmployee()
{
this.accpetPerson();
System.out.println("Enter Employee Id = ");
Empid = sc.nextInt();
System.out.println("Enter Salary = ");
Salary = sc.nextDouble();
}
public double CalculateSal() {
	return Salary=Salary+100;
}
public void displayEmployee()
{
this.displayPerson();
System.out.println("Empid = "+this.Empid);
System.out.println("Salary = "+this.Salary);
}
}

