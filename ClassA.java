package PackageA;

public class ClassA {
	protected int data = 10;
	
	protected void display() {
		System.out.println("data is"+ data);
	}

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.display();

	}

}
