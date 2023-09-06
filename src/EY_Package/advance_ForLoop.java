package EY_Package;

public class advance_ForLoop {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5,6,7,87};
		
		for(int data : intArr) {
			System.out.print(data + " ");
		}
		System.out.println();
		String[] strArr = {"A","B","C","D"};
		
		for(String str: strArr) {
			System.out.print(str + " ");
		}
	}
}
