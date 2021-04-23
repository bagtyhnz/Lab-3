package d22_Lab3;

import java.util.Scanner;

import d19_Strings.StringCharAt;

public class Q6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scn.nextLine();
		System.out.println(word.substring(1, word.length() - 1));
		scn.close();
	}

}
