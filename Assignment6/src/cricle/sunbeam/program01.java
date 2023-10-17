package cricle.sunbeam;



public class program01 {
	public static void main(String[] args) {
		
		Circle circle= new Circle();
		try {
			
			circle.AcceptData();
			circle.DisplayData();
		}
		catch(UserDefineException u)
		{
			u.display();
		}
		
	}
