package class_2;

class Machine{
	void start() {
		System.out.println("Machine has started!");
	}
	
	void stop() {
		System.out.println("Machine has stopped!");
	}
}

class Camera extends Machine{
	@Override //good programming practice-
	void start() {
		System.out.println("Camera has started!");
	}
	void snap() {
		System.out.println("Photo Clicked!");
	}
}

public class TypeCastingConcept {

	public static void main(String[] args) {
		Machine m = new Machine();
		m.start(); //Machine has started
		m.stop(); //Machine has stopped
		
		Camera c = new Camera();
		c.start(); //Camera has started!
		c.stop(); //machine has stopped!
		c.snap(); //photo clicked!
		
		Machine pc = new Camera ();  //upcasting is there
		pc.start();
		pc.stop();
		
		//upcasting automatically
		Machine m2 = c;
		m2.start();
		m2.stop();
		
		//Downcasting - correct
		Machine m3 = new Camera();
		Camera c2 = (Camera)m3; //downcasting
		c2.start();
		c2.stop();
		c2.snap();

}
}
