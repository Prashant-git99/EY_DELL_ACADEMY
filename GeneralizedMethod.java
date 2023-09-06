package Class_6;

public class GeneralizedMethod {

	public static void main(String[] args) {
		
		Integer[] intArr = {10,2,5,7,9,4,45,6,3,9,33};
		String[] strArr= {"C","F","R","U","O"};
		
		System.out.println("Printing Integer Array");
		printArray(intArr);
		
		System.out.println("Printing String Array");
		printArray(strArr);
		
	}
	static <F> void printArray(F[] elements)
	{
		for(F e: elements)
		{
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
