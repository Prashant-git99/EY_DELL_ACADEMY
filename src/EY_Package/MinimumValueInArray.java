package EY_Package;

public class MinimumValueInArray {

	public static void main(String[] args) {
		
		int intArr[] = {10,2,4,5,6,34,98,77,8,4,56};
		min(intArr);
	}
	static void min(int[] intArr) {
		int min = intArr[0];
		for(int i=0; i<intArr.length;i++) {
			if (min > intArr[i]) {
				min = intArr[i];
			}
		}
		System.out.println("Minimum value is " + min);
	}

}
