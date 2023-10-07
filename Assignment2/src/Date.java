import java.util.Scanner;

public class Date {
   int day;
   int month;
   int year;
   
public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

public Date() {
	this.day=0;
	this.month=0;
	this.year=0;
	
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;

}
  void accept() {
	  System.out.println("Enter date");
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter day = ");
   day=sc.nextInt();
   System.out.print("Enter month = ");
   month=sc.nextInt();
   System.out.print("Enter year = ");
   year=sc.nextInt();
  }
  void disply() {
	  System.out.println(day+"/"+month+"/"+year);
  }
  
   

   
	
}























