import java.util.Scanner;

public class Invoice {
	String partNo;
	String partDesc;
	int quantity;
	double price;
	public Invoice() {
		this.partNo="";
		this.partDesc="";
		this.quantity=0;
		this.price=0.0;
	}
	public Invoice(String partNo, String partDesc, int quantity, double price) {
		super();
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	}
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("EnterPartNo = ");
		partNo=sc.next();
		System.out.println("EnterPartDes= ");
		partDesc=sc.next();
		System.out.println("Enter Quentity = ");
		quantity=sc.nextInt();
		if(quantity<0) {
			this.quantity=(0);
		}
		System.out.println("Enter Price =  ");
		price=sc.nextDouble();
		if(price<0) {
			this.price=(0.0);
		}
		price= price * quantity;
	
	}
	void display() {
		System.out.println(partNo+" "+partDesc+" "+price);
	
		
	}

}
















