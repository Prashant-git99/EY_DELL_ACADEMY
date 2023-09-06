package EY_Package;

public class ArraysCreation {

	public static void main(String[] args) {
		
		//declaration - instantiation -
		int[] intArr = new int[6];
		
		//initialization
		intArr[0] = 10;
		intArr[5] = 20;
		intArr[2] = 30;
		intArr[4] = 40;
		intArr[3] = 67;
		
		//declaration, initialisation and initialization
		String[] strArr = {"A","B","C","D"};
		
		//traverse
		for(int i =0; i<=intArr.length - 1; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i< strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		
		}
		System.out.println();
		for(int i : intArr) {
			System.out.print(i + " ");
		}

	}

}
