package User.Register;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class incomeFormat 
{
	private incomeFormat() {
	}
		public static String currencyFormat(BigDecimal bg) {
			Locale locale =new Locale("hi", "IN");
			NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
			return nf.format(bg.doubleValue());
		}
	}