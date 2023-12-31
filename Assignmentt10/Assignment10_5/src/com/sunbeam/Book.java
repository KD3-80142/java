package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>  {
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
		return "Book [isbn=" + isbn + ", price=" + price + ", AuthorName=" + AuthorName + ", quantity=" + quantity
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
	
	public int compareTo(Book bb) {
		int diff=this.isbn.compareTo(bb.isbn);
				return diff;
		
	}
	public int hashcode() {
		int ss=Objects.hash(this.isbn);
		return ss;
	}
	public void Accept() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter isbn of book");
	    isbn=sc.next();
	    System.out.println("Enter price of book");
	    price=sc.nextInt();
	    System.out.println("Enter AuthorName of book");
	    AuthorName=sc.next();
	    System.out.println("Enter Quentity you want");
	    quantity=sc.nextInt();
	}
}
