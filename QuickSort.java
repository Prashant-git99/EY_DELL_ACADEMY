package Class_10;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] intArr = {3,60,35,2,45,576,7,-5};
		int lengthOfArray = intArr.length;
		
		System.out.println("Before Quick sort");
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		QuickSort.quickSort(intArr, 0, lengthOfArray - 1);
		System.out.println();
		
		System.out.println("After Quick sort");
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
	//here we first choose a pivot , after partitioning, we rearrange the array into sub array so each element
	//in the left sub array is less than or equal to pivot and each element in the right sub array is greater than
	//or equal to pivot
	static void quickSort(int[] intArr, int startElement, int endElement) {
		
		if(startElement < endElement) {
			int p = partition(intArr, startElement, endElement); //p is the partition index
			quickSort(intArr, startElement, p-1);
			quickSort(intArr, p+1, endElement);
		}
	}
	
	//consider last element as pivot, place the pivot at its exact location, place small 
	//greater element to right of pivot
	static int partition(int[] intArr, int startPosition, int endPosition) {
		int pivotElement = intArr[endPosition]; //pivot element
		int i = (startPosition - 1);
		
		for(int j=startPosition; j<= endPosition; j++) {
			//if current element is smaller than pivot
			if(intArr[j] < pivotElement) {
				i++; //increment index of smaller element
				int t = intArr[i];
				intArr[i] = intArr[j];
				intArr[j] = t;
			}
		}
		int t = intArr[i + 1];
		intArr[i + 1] = intArr[endPosition];
		intArr[endPosition] = t;
		return (i + 1);
	}

}
