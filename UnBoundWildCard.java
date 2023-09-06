package Class_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnBoundWildCard {

	public static void main(String[] args) {
		
		UnBoundWildCard obj = new UnBoundWildCard();
		List<String> listStr = new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollectionData(listStr);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(123);
		listInt.add(897);
		obj.printCollectionData(listInt);   
	}
	
	void printCollectionData(Collection<?> objToPrint) {
		System.out.println("[");
		for(Object obj: objToPrint) {
			System.out.println(obj.getClass().getCanonicalName() + " : " + obj);
		}
		System.out.println("]");
		System.out.println();
	}

}
