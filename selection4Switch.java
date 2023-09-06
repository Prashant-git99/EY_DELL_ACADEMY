package EY_Package;

public class selection4Switch {

	public static void main(String[] args) {
		
		grading('A');
		grading('B');
		grading('C');
		grading('D');
		
	}
	static void grading(char grade) {
		int success;
		
		switch (grade) {
		case 'A':
		    success = 1;
		    System.out.println("Excellent Grade");
		    break;
		case 'B':
		case 'C':
		success = 0;
		System.out.println("good Grade");
		break;
	default:
	    success = -1;
	    System.out.println("unknown grade");
		}
		PassTheCourse(success);
	}
	static void PassTheCourse(int success) {
		switch(success) {
		case 1:
			System.out.println("passed the course");
			break;
		case 0:
			System.out.println("can give the xam again, your option");
			break;
		case -1:
			System.out.println("reschedule the xam date");
			break;
		}
	}
}