package com.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int x;
		System.out.println("Enter a year ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x % 4 == 0) {
			if (x % 100 == 0) {
				if (x % 400 == 0) {
					System.out.println("leap year");
				} else {
					System.out.println("not a leap year");
				}
			} else {
				System.out.println("leap year");
			}
		} else {
			System.out.println("not a leap year");
		}

	}
}