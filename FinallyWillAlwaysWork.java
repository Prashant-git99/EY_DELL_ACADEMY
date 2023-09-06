package Class3;

public class FinallyWillAlwaysWork {

	public static void main(String[] args) {
		
		int result = sampleMethod();
		System.out.println("Result is " + result);
	}
	
	static int sampleMethod() {
		try {
			return 123;
		}
		finally {
			System.out.println("Code just returning a integer 123");
		}
	}

}
