package Class_10;

public class SortArraysUsingHeapSort {

	public static void main(String[] args) {
		
	int[] intArr = {3,60,35,2,45,576,7};
		
		System.out.println("Before heap sort");
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		SortArraysUsingHeapSort.heapSort(intArr);
		System.out.println();
		
		System.out.println("After heap sort");
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

	}
	static void heapSort(int[] intArr) {
		int lengthOfArray = intArr.length;
		for(int i=lengthOfArray/2 -1; i>=0; i--) {
			heapify(intArr, lengthOfArray, i);
		}
		for(int i= lengthOfArray -1; i>=0; i--) {
			//move current of element to end and swap intArr[length - 1]
			int temp = intArr[0];
			intArr[0] = intArr[i];
			intArr[i] = temp;
			
			heapify(intArr, i,0);
		}
	}
	//remove the root element repeatedly by shifting to the end of the array then store heap with remaining elements
	//heap is the complete binary tree and binary tree is a tree in which every node can have maximum of to children
	static void heapify(int[] intArr, int lengthOfArray, int i) {
		int largestElement = i; //initialize largest as root
		int left = 2*i + 1; //left child
		int right = 2*i +2; //right child
		//if left child is greater than root
		if(left < lengthOfArray && intArr[left] > intArr[largestElement]) {
			largestElement = left;
		}
		//if right element is largest than root
		if(right < lengthOfArray && intArr[right] > intArr[largestElement]) {
			largestElement = right;
		}
		//if root is not largest
		if(largestElement != i) {
			//swap intArr[i] with intArr[largest]
			int tempArr = intArr[i];
			intArr[i] = intArr[largestElement];
			intArr[largestElement] = tempArr;
			
			heapify(intArr, lengthOfArray, largestElement);
		}
	}

}
