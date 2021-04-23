package d22_Lab3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scn.nextLine();
		String twoChars = word.substring(0, 2);
		String lastTwoChars = word.substring(word.length() - 2);
		System.out.println(twoChars.equals(lastTwoChars));
		scn.close();
	}

}
