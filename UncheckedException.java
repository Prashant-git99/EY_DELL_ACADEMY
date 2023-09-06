package Class3;

public class UncheckedException {

	public static void main(String[] args) {
		
		//int data = 10/0 ;
		//System.out.println("value of data is " + data);
		//arithmatic
		
		UncheckedException obj = new UncheckedException();
		obj = null;
		obj.abc();
	}
	void abc() {
		System.out.println("Hi");
	}

}
