package comm.sunbeam;

import java.util.Objects;

public class Book implements Comparable<Book> {
	  private String isbn;
	    private double price;
	    private String AuthorName;
	    private int quantity;
	    public Book() {
			// TODO Auto-generated constructor stub
		}
		public Book(String isbn, double price, String authorName, int quantity) {
			
			this.isbn = isbn;
			this.price = price;
			AuthorName = authorName;
			this.quantity = quantity;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthorName() {
			return AuthorName;
		}
		public void setAuthorName(String authorName) {
			AuthorName = authorName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "\n Book [isbn=" + isbn + ", price=" + price + ", AuthorName=" + AuthorName + ", quantity=" + quantity
					+ "]";
		}
	
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Book) {
			Book other =(Book) obj;
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Book bb1) {
		int diff = this.isbn.compareTo(bb1.isbn);
		return diff;
	}
	
	public int haschcode() {
		int hash=Objects.hash(this.isbn);
        return hash;		
		
	}

}
