package Class_10;

public class SwapElements {

	public static void main(String[] args) {
		
		int[] intArr = {20,2,56,-19,100,4,0};
		System.out.println("Elements before swapping");
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		//lets say we want to swap element at 4th index with 2nd index
		int firstIndex = 2, secondIndex=4;
		
		//temp Variable
		int temp = intArr[firstIndex];
		
		//swapping
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;
		
		System.out.println("Element After Swapping 4th Index value with 2nd index");
		for(int i : intArr) {
			System.out.print(i + " ");
		}
	}
}
