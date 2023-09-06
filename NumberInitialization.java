package class_2;

public class NumberInitialization {
	int number1;
	static int number2;
	
	static {
		System.out.println("Static Initializer Block");
		number2 = 100;
	}
    NumberInitialization(){
    	number1 = 78;
    }

	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println("The value of number2 is "+ number2);
		
		NumberInitialization obj = new NumberInitialization();
		System.out.println("The value of number1 is " + obj.number1);
		

	}

}
