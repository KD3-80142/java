
package comm.sunbeam;
import java.util.*;

public class Bookmain {
	
	

	public static void main(String[] args) {
		
		
		TreeSet<Book> set = new TreeSet<>();
		Book b1 = new Book("Mk47",500.20, "King", 1);
		set.add(b1);
		set.add(new Book("BN87",777.12, "Scott", 2));
		set.add(new Book("R8",1200.0, "rahul", 4));
		set.add(new Book("Mk47",800, "Dhoni", 7));
//        set.add(null);
		System.out.println("Using interator");
			Iterator<Book> itr =set.iterator();
			while(itr.hasNext()) {
				Book e =itr.next();
				System.out.println(e);
			}
			System.out.println("Using Desending interator");
			Iterator<Book>  bb =set.descendingIterator();
			while(bb.hasNext()) {
				Book b=bb.next();
				System.out.println(b);
			}
		}
	}
  
//treeset dose not Accept null value
//Not accepted duplicate value
// sotring 


