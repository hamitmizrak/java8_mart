package com.ecodation.common;

public class Ders_011_loop {

	public static void main(String[] args) {
		int a;
		for (a = 0; a <= 5; a = a * 2 / 2 + 1) {
			System.out.print(a + " ");
		}
		System.out.println("\n-------------------------------");

		int b = 0;
		while (b < 10) {
			System.out.print(b + " ");
			b++;
		}

		System.out.println("\n+++++++++++++++++++++++++++++++++");
		int c = 1;
		do {
			// ++c;
			System.out.println("en az " + c + " kez çalışacak");
			c++;

		} while (c <= 5);
	}

}
