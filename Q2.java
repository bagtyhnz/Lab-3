package d22_Lab3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a: ");
		String a = scn.nextLine();

		System.out.println("enter b: ");
		String b = scn.nextLine();
		scn.close();

		makeAbba(a, b);
	}

	private static void makeAbba(String a, String b) {
		String abba = a.concat(b).concat(b).concat(a);
		System.out.println(abba);

	}

}
