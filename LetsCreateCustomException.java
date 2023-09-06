package Class3;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class LetsCreateCustomException {

	public static void main(String[] args) {
		try {
			validVoterStatus(17);
		} catch (InvalidAgeException e) {
			System.out.println("Exception Message is " + e.getMessage());
		}
		
		System.out.println("Code will run smoothly afterwards");
	}
	
	static void validVoterStatus(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("User Cannot vote");
		}
	}

}
