package Class_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowComparableAndComparatorWorks {

	public static void main(String[] args) {
		int[] intArr = {10,3,9,45,67,3,6,3};
		Arrays.sort(intArr);
		System.out.println("Sorted Integer arrays is " + Arrays.toString(intArr));
		
		String[] strArr = {"A","B","J","T","Y"};
		Arrays.sort(strArr);
		System.out.println("Sorted Integer arrays is " + Arrays.toString(intArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z");listStr.add("A");listStr.add("B");listStr.add("I");

	}

}
