package bridgelabz.swapnumber;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		int x;
		int y;
		int t;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the valve x and y ");

		x = s.nextInt();
		y = s.nextInt();

		System.out.println("before swapping number: " + x + " " + y);

		t = x;

		x = y;

		y = t;

		System.out.println("after swapping : " + x + " " + y);
		
	}

}
