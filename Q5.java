package d22_Lab3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word of even length: ");
		String word = scn.nextLine();
		System.out.println(word.substring(0, word.length() / 2));
		scn.close();
	}

}
