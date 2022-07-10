package bridgelabz.evenodd;

import java.util.Scanner;

public class EvenOddProgram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num1 = s.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("Is A Even Number: ");
		} else {
			System.out.println("Is A Odd Number: ");

		}
	}

}
