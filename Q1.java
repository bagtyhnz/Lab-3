package d22_Lab3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("what is ur name?");
		String name = scn.nextLine();
		System.out.println(greeting(name));
		scn.close();
	}

	private static String greeting(String name) {

		name = "hello ".concat(name);
		return name;
	}

}
