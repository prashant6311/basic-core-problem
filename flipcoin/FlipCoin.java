package bridgelabz.flipcoin;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of flip coin");
		int num = sc.nextInt();
		int heads = 0, tails = 0;
		if (num > 0) {
			double[] result = new double[num];
			for (int i = 0; i < num; i++) {
				result[i] = Math.random();
				if (result[i] < 0.5) {
					tails++;
				} else {
					heads++;
				}
			}
			System.out.println("tails " + tails);
			float percentagesOfTails = (tails * 100) / num;
			System.out.println("percentage of tails " + percentagesOfTails);
			System.out.println("heads " + heads);
			float percentagesOfHeads = (heads * 100) / num;
			System.out.println("percentage of  " + percentagesOfHeads);

		} else {
			System.out.println("Enter a positive number");
		}
	}

}
