package class_2;

abstract class Sample{
	abstract void show();
}

public class AnonymousInnerclass {

	public static void main(String[] args) {
		Sample obj = new Sample() {
			@Override 
			void show() {
				System.out.println("Hello everyone!");
			}
			
		};
		obj.show();

	}

}
