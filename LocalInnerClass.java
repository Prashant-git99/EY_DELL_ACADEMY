package class_2;

public class LocalInnerClass {
	
	private int data = 20;
	
	void message() {
	class XYZ{
		void show() {
			System.out.println("the value of data " + data);
		}
	}
	XYZ obj = new XYZ();
	obj.show();
		
	}

	public static void main(String[] args) {
		LocalInnerClass obj2 = new LocalInnerClass();
		obj2.message();		

	}

}
