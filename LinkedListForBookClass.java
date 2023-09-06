package Class_5;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListForBookClass {

	public static void main(String[] args) {
		
		LinkedList<Book> List = new LinkedList<>();
		 Book b1 = new Book(2, "A", "R", "C", 19);
		 Book b2 = new Book(11, "p", "M", "R", 99);
		 Book b3 = new Book(82, "M", "N", "U", 746);
		 
		 List.add(b1);List.add(b1);List.add(b1);
		 List.add(b3);List.add(b2);List.add(b2);
		 
		 for(Book b : List) {
			 System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " +b.author + " " + b.quantity);
		 }
		 
		 Iterator<Book> itr = List.iterator();
		 while(itr.hasNext()) {
			 Book b = itr.next();
			 System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		 }

	}

}
