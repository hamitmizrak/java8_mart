package com.ecodation.common;

import java.util.Scanner;

public class Ders_010_SwitchCas2 {

	public static void main(String[] args) {

		// kullanıcıdan girmiş olduğunu günü bulan bir algoritma
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen bir ay giriniz");
		String aylar = klavye.nextLine();
		switch (aylar) {
			case "ocak":
				System.out.println("aylardan: " + aylar);
				break;
			case "şubat":
				System.out.println("aylardan: " + aylar);
				break;
			case "mart":
				System.out.println("aylardan: " + aylar);
				break;
			case "nisan":
				System.out.println("aylardan: " + aylar);
				break;
			case "mayıs":
				System.out.println("aylardan: " + aylar);
				break;
			case "haziran":
				System.out.println("aylardan: " + aylar);
				break;
			case "temmuz":
				System.out.println("aylardan: " + aylar);
				break;
			case "ağustos":
				System.out.println("aylardan: " + aylar);
				break;
			case "eylül":
				System.out.println("aylardan: " + aylar);
				break;
			case "ekim":
				System.out.println("aylardan: " + aylar);
				break;
			case "kasım":
				System.out.println("aylardan: " + aylar);
				break;
			case "aralık":
				System.out.println("aylardan: " + aylar);
				break;
			default:
				System.out.println("Farklı bir gün girdiniz");
				break;
		}
	}

	// örnek aylar :

}
