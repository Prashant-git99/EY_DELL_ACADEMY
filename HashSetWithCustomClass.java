package Class_5;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetWithCustomClass {

	public static void main(String[] args) {
		
		TreeSet<Book> treeSet = new TreeSet<>();
		
		Book b1 = new Book(1, "A", "B", "C", 10);
		Book b2 = new Book(12, "T", "B", "Y", 70);
		Book b3 = new Book(15, "AT", "C", "S", 110);
		
		treeSet.add(b3);treeSet.add(b2);treeSet.add(b1);
		
		Iterator<Book> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
	}
}
