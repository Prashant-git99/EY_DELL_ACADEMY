package EY_Package;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		int[] intArr = {10,9,60,77,3,6};
		Arrays.sort(intArr);
		System.out.println("Sorted Array is " + Arrays.toString(intArr));
		
		String[] strArr = {"A","B","C","D","E"};
		Arrays.sort(strArr);
		System.out.println("sorted array is" + Arrays.toString(strArr));

	}

}
