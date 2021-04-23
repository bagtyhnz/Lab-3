package d22_Lab3;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a 1st word: ");
		String word = scn.nextLine();
		System.out.println("enter a 2st word: ");
		String word2 = scn.nextLine();

		if (word.length() > word2.length()) {
			System.out.println(word2.concat(word).concat(word2));
		} else {
			System.out.println(word.concat(word2).concat(word));

		}
		scn.close();
	}

}
