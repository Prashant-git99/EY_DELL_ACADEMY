package Class3;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//data types
		byte grade = 2;
		short marks = 20;
		float price = 8.3f;
		double rate = 240.3D;
		boolean flag = false;
		char initial = 'A';
		
		//Autoboxing - to get a object out of a data type-wrapper class
		Byte bObject = new Byte(grade);
		Short sObject = new Short(marks);
		System.out.println("Data type grade is " + grade);
		System.out.println("Object bObject is " + bObject);
		
		byte byteValue = bObject.byteValue(); //unboxing
		System.out.println(byteValue);

	}

}
