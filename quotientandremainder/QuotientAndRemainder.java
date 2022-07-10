package bridgelabz.quotientandremainder;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		
		int dividend = p.nextInt();
		int divisor = p.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient " + quotient);
		System.out.println("Remaimder " + remainder);
	}

}
