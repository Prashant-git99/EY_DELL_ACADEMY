package EY_Package;

import java.util.Arrays;

public class ArraysComparison {

	public static void main(String[] args) {
		
		int[] intArr1 = {1,2};
		int[] intArr2 = {1,2};
		
		boolean[] blnArr1 = {true, false};
		boolean[] blnArr2 = {true, false};
		
		if(intArr1 == intArr2) {
			System.out.println("== works for Arrays");
		}
		else {
			System.out.println("== does not work for arrays");
		}
		if(blnArr1 == blnArr2) {
			System.out.println("== works for arrays");
		}else {
			System.out.println("== does not work for arrays");
		}
		boolean result = Arrays.equals(blnArr1,  blnArr2);
		System.out.println("result is" + result);
		
		System.out.println("result is" + Arrays.equals(intArr1, intArr2));
		
		

	}

}
