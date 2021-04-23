package d22_Lab3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scn.nextLine();
		System.out.println(word.substring(2).concat(word.substring(0, 2)));
		scn.close();
	}

}
