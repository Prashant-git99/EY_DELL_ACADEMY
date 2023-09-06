package Class_5;

import java.util.HashMap;
import java.util.Map;

public class HashMapForCustomClasses {

	public static void main(String[] args) {
		
		HashMap<Integer, Book> hMap = new HashMap<>();
		
		Book b1 = new Book(1, "A", "B", "C", 10);
		Book b2 = new Book(12, "P", "Q", "R", 100);
		Book b3 = new Book(34, "M", "N", "O", 1800);
		
		hMap.put(123, b3);
		hMap.put(135, b2);
		hMap.put(987, b3);
		
		for(Map.Entry<Integer, Book> m: hMap.entrySet()) {
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println("Key " + key + " details are : ");
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
	}
}
