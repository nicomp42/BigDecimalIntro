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
		//demoOfPrecision();
	}
	public static void demo() {

		// Declare and instantiate
		BigDecimal bigDecimalAmount = new BigDecimal("14.00");

		// Add
		//bigDecimalAmount.add(new BigDecimal("100"));						// Nope.
		bigDecimalAmount = bigDecimalAmount.add(new BigDecimal("100"));

		// Print
		System.out.println(bigDecimalAmount.toString());

		// Big number
		bigDecimalAmount = new BigDecimal("123456789012345678901234567890.0000000000000000000000000001");

		// Print
		System.out.println(bigDecimalAmount.toString());

		// We can't even do this with a double. Lotta losses
		double notGonnaHappen = 123456789012345678901234567890.0000000000000000000000000001;
		System.out.println(notGonnaHappen);

	}
	/**
	 * Demonstrate the precision issues
	 */
	public static void demoOfPrecision() {

		BigDecimal bigDecimalAmount = new BigDecimal("14.00");
		double doubleAmount = 14.00;

		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.println("Double Amount      = " + doubleAmount);
		System.out.println("---------------------------------------------------------");

		// Apply 7.5% sales tax to both amounts
		bigDecimalAmount = bigDecimalAmount.multiply(new BigDecimal("1.075"));
		doubleAmount *= 1.075;

		// Some error creeps in here when we use double
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.println("Double Amount      = " + doubleAmount);
		System.out.println("---------------------------------------------------------");

		// We can make the error much worse
		bigDecimalAmount = new BigDecimal("1234567899");
		doubleAmount = 1234567899;
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.printf("Double Amount      = %.2f \n", doubleAmount);
		System.out.println("---------------------------------------------------------");

		// Add one penny. No problem.
		bigDecimalAmount = bigDecimalAmount.add(new BigDecimal(".01"));
		doubleAmount += .01;
		System.out.println("---------------------------------------------------------");

		// Print again
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.printf("Double Amount      = %.2f \n" , doubleAmount);
		System.out.println("---------------------------------------------------------");
/*
		// Add a billion microtransactions of .0001 to both variables. That would be 1,000,000,000 * .0001 = $100,000 dollars. Big Problem.

		for (int i = 0; i < 1_000_000_000; i++) {	// This will take a while
			bigDecimalAmount = bigDecimalAmount.add(new BigDecimal(".0001"));
			doubleAmount += .0001;
		}
		// Print again
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.printf("Double Amount      = %.2f \n" , doubleAmount);
		System.out.println("---------------------------------------------------------");
*/

/*
		// Reset to zero and add a billion microtransactions of .000715 (sales tax on one penny) to both variables. That would be 1,000,000,000 * .00075 = $750,000 dollars. Big Problem.
		bigDecimalAmount = new BigDecimal("0");
		doubleAmount = 0;

		for (int i = 0; i < 1_000_000_000; i++) {	// This will take a while
			bigDecimalAmount = bigDecimalAmount.add(new BigDecimal(".000715"));
			doubleAmount += .000715;
		}
		// Print again
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.printf("Double Amount      = %.2f \n" , doubleAmount);
		System.out.println("---------------------------------------------------------");
*/
		// One microtransaction of one tenth of a penny and sales tax on that
		bigDecimalAmount = new BigDecimal(".0010715");
		doubleAmount = .0010715;
		// Print again
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.println("Double Amount      = " + doubleAmount);
		System.out.println("---------------------------------------------------------");

/*
		// Reset to zero and add a billion microtransactions of .0010715 (one tenth of a penny and sales tax on that) to both variables. That would be 1,000,000,000 * .001075 = $1,750,000 dollars. Big Problem.
		bigDecimalAmount = new BigDecimal("0");
		doubleAmount = 0;

		for (int i = 0; i < 1_000_000_000; i++) {	// This will take a while
			bigDecimalAmount = bigDecimalAmount.add(new BigDecimal(".0010715"));
			doubleAmount += .0010715;
		}
		// Print again
		System.out.println("Big Decimal Amount = " + bigDecimalAmount.toString());
		System.out.printf("Double Amount      = %.2f \n" , doubleAmount);
		System.out.println("---------------------------------------------------------");
*/



	}

}
