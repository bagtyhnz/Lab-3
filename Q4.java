package d22_Lab3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scn.nextLine();

		String first2 = word.substring(0, 2);
		if (word.length() > 2) {
			System.out.println(first2);
		} else if (word.length() == 0 || word.length() == 1) {
			System.out.println(word);

		}
		scn.close();
	}

}
