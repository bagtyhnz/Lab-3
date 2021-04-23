package d22_Lab3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scn.nextLine();
		System.out.println(word.substring(word.length() - 2).concat(word.substring(0, word.length() - 2)));
		scn.close();
	}

}
