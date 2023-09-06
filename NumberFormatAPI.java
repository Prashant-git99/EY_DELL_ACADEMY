package Class_10;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class NumberFormatAPI {

	public static void main(String[] args) {
		
		long number = 50000L;
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Number Format using Default Locale is " + nf.format(number));
		
		NumberFormat italyNF = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Number Format using Default Locale is " + italyNF.format(number));
		
		NumberFormat defaultCurrency = NumberFormat.getCurrencyInstance();
		System.out.println("Number Format using Default Locale is " + defaultCurrency.format(number));
		
		NumberFormat usingItalianCurrency = NumberFormat.getCurrencyInstance();
		System.out.println("Number Format using Default Locale is " + usingItalianCurrency.format(number));
		
		Currency usd = Currency.getInstance("USD");
		NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
		//nf.setCurrency(usd);
		System.out.println("Number Format using Italy Locale is " + usCurrency.format(1234));

		Date currentDate = new Date();
		DateFormat germanDF = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		System.out.println("date format using germany Locale is " + germanDF.format(currentDate));
	}
}
