package class_2;

public class EqualsMethod {

	public static void main(String[] args) {
		String str1 = "String is a immutable class";
		String str2 = "String is a immutable class";
		
		if(str1 == str2) {
			System.out.println("== works for literals or constants");
		}
		else {
			System.out.println("== does not works for literals or constants");
		}
		
		//objects
		String str3 = new String("String is immutable class");
		String str4 = new String("String is immutable class");
		
		if(str3.equals(str4)) {
			System.out.println("equals method work for objects");
		}
		else {
			System.out.println("equals method does not work for objects");
		}
		System.out.println("Memory Address is " + str3.hashCode());
		System.out.println("Memory Address is " + str4.hashCode());
		

	}

}
