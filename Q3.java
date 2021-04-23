package d22_Lab3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scn.nextLine();

		String last2 = word.substring(word.length() - 2, word.length());
		extraEnd(last2);
		scn.close();
	}

	private static void extraEnd(String last2) {
		System.out.println(last2.concat(last2).concat(last2));

	}

}
