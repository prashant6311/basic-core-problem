package bridgelabz.vowelandconsonant;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a letter :");
		
		char ch1 = s.next().charAt(0);
		switch (ch1) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Is Vowel ");
			break;
		default:
			
			System.out.println("Is Consonant " );
		}

	}

}
