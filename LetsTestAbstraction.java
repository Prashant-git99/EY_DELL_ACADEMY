package class_2;

abstract class Shape{
	
	//unique functionality - define
	abstract void draw();  //declaration
	
	int length, area, breath, height, radius;
	double areaOfCircle;
	//common functionality which every one can use
	void purpose() {
		System.out.println("Calculate the area of different shapes");
	}
	
}
class Triangle extends Shape {
	@Override 
	void draw() {
		int length = 10, breath = 30;
		area=(breath*height)/2;
		purpose();
		System.out.println("area of triangle "+ area);
	}
	
}
class Rectangle extends Shape {
	@Override 
	void draw(){
	int length = 20, breath=10;
	area= length*breath;
	purpose();
	System.out.println("Area of rectangle" +area);
}
}
		
class Circle extends Shape {
	@Override 
	void draw() {
		int radius = 10;
		areaOfCircle = Math.PI * radius * radius;
		purpose();
		System.out.println("area of circle is "+ areaOfCircle);
	}
}

public class LetsTestAbstraction {

	public static void main(String[] args) {
		
		//Shape sh = new Shape();
		
		Triangle tr = new Triangle();
		tr.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		Shape cr = new Circle();
		cr.draw();

	}

}
