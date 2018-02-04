package main;

import java.math.BigDecimal;

/**
 * Demonstration of BigDecimal class	
 * @author nicomp
 *
 */
public class Main {

	
	public static void main(String[] args) {
		demo();
	}
	/**
	 * Demonstrate the 
	 */
	public static void demo() {

		BigDecimal bigDecimalAmount = new BigDecimal("14.00");
		double doubleAmount = 14.00;
		
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.println("Double Amount = " + doubleAmount);

		// Apply 7.5% sales tax to both amounts
		bigDecimalAmount = bigDecimalAmount.multiply(new BigDecimal("1.075"));
		doubleAmount *= 1.075;

		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.println("Double Amount = " + doubleAmount);
		
		
		
	}
	
}
