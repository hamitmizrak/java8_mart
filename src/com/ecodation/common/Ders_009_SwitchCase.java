package com.ecodation.common;

import java.util.Scanner;

public class Ders_009_SwitchCase {

	public static void main(String[] args) {

		// String kelime = "Java Se ME";
		// if (kelime.equals("Java")) {
		// System.out.println("Java");
		// } else if (kelime.equals("Java se")) {
		// System.out.println("Java se");
		// } else if (kelime.equalsIgnoreCase("Java se me")) {
		// System.out.println("Java se me");
		// } else if (kelime.equals("Java se me ee ")) {
		// System.out.println("Java se me ee");
		// } else {
		// System.out.println("farklı kelime girdiniz");
		// }

		// kullanıcıdan girmiş olduğunu günü bulan bir algoritma
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen bir gün giriniz");
		String gunler = klavye.nextLine();
		switch (gunler) {
			case "sali":
				System.out.println("günlerden: " + gunler);
				break;
			case "pazartesi":
				System.out.println("günlerden: " + gunler);
				break;
			case "çarşamba":
				System.out.println("günlerden: " + gunler);
				break;
			case "perşembe":
				System.out.println("günlerden: " + gunler);
				break;
			case "cuma":
				System.out.println("günlerden: " + gunler);
				break;
			case "cumartesi":
				System.out.println("günlerden: " + gunler);
				break;
			case "pazar":
				System.out.println("günlerden: " + gunler);
				break;
			default:
				System.out.println("Farklı bir gün girdiniz");
				break;
		}
	}

	// örnek aylar :

}
