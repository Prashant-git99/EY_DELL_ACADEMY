package Class4;

public class FinalKeyword {
	
	final static String PAN_CARD_NUMBER;
	/*
	 * FinalKeyword() {PAN_CARD_NUMBER = "";}
	 */
	static {
		PAN_CARD_NUMBER = "ABCDE9090J";
	}
	final void display() {
		System.out.println("Final Method");
	}

	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		System.out.println("Obj is :" + obj.PAN_CARD_NUMBER);			
		}

	}
