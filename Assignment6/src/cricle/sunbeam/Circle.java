package cricle.sunbeam;
import java.util.*;
public class Circle {
private double x_axis;
private double y_axis;
private double myDiameter;

public Circle() {
	super();
	this.x_axis = 0;
	this.y_axis = 0;
	this.myDiameter = 100;
	
}

public void AcceptData() throws UserDefineException
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the x axis");
	this.x_axis = sc.nextDouble();
	System.out.println("Please enter the y axis");
	this.y_axis = sc.nextDouble();
	
	
		System.out.println("Please enter the Diameter ");
	
		this.myDiameter = sc.nextDouble();
		if(myDiameter<0)
			throw new UserDefineException("Diameter should not be negative");
		sc.close();
	
}

public void DisplayData()
{
	System.out.println("The x axis"+this.x_axis);
	
	System.out.println("The y axis"+this.y_axis);
	
	System.out.println("The Diameter "+this.myDiameter);
	

	
}

}