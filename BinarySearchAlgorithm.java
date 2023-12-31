package Class_10;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		
		int[] intArr = {10,44,6,98,2,4,9, 32};
		Arrays.sort(intArr);
		System.out.println("Sorted array is " + Arrays.toString(intArr));
		int lookOutFor = 32;
		int lastElementPositionInArray = intArr.length - 1;
		binarySearch(intArr, 0, lastElementPositionInArray, lookOutFor);		
	}
	//in binary search, it is mandatory to sort elements before searching
	static void binarySearch(int[] intArr, int startingPosition, int lastPosition, int searchElement) {
		int midElementPosition = (startingPosition + lastPosition)/2;
		while(startingPosition <= lastPosition) {
			if(intArr[midElementPosition] < searchElement) {
				startingPosition = midElementPosition + 1;
	    	}else if(intArr[midElementPosition] == searchElement) {
	    		System.out.println("Element found at position " + midElementPosition);
	    		
	    		break;
	    	}else {
	    		lastPosition = midElementPosition - 1;
	    	}
	    	midElementPosition = (startingPosition + lastPosition)/2;
		}
		if(startingPosition > lastPosition) {
			System.out.println(" Element is not found! ");
		}
	}
}
