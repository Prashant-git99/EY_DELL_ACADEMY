package Class_10;

import java.time.LocalDate;
import java.time.LocalTime;

public class FuntionsOfLocalDateAPI {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("Year " + today.getYear() + " is a leap year of" + "not" + today.isLeapYear());
		
		System.out.println("Curent Time is " + today.atTime(LocalTime.now()));
		
		System.out.println("10 days after today will be " + today.plusDays(10));
		System.out.println("3 days after today will be " + today.plusWeeks(3));
		System.out.println("20 days after today will be " + today.plusMonths(20));
		
		System.out.println("10 days b4 today will be " + today.minusDays(10));
		System.out.println("3 weeks b4 today will be " + today.minusWeeks(3));
		System.out.println("20 month b4 today will be " + today.minusMonths(20));
	}
}
