import java.math.BigDecimal;

public class Calculator {

    /**
     * Sums an array of numbers.
     *
     * @return the exact sum of the given numbers
     */
	static String sum(String... numbers) {
		double total = 0;
		BigDecimal bigTotal = new BigDecimal("0.00");
		for(String number: numbers) {
			bigTotal = bigTotal.add(new BigDecimal(number));
		}
		
		return String.valueOf(bigTotal);
	}
}
