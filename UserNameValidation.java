package Class_09;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd34")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd347")); //false

	}

}
