package Class_09;

import java.util.regex.Pattern;

public class MobileNumberValidation {

			public static void main(String[] args) {
				
				//Mobile Number Validation
				System.out.println(Pattern.matches("[6789]{1}[0-9]{9}","9999876510")); //true

			}
	}
