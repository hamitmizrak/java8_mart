package com.ecodation.ornekler;

import java.util.Scanner;

//negatif mi pzoitif mi

public class Ornekler_007_negatif_pozitif {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		while (true) { // sonsuz döngü
			System.out.println("Lütfen bir sayı giriniz");
			int sayi = klavye.nextInt();
			if (sayi < 0) {
				System.out.println("negatif bir sayıdır");
			} else {
				System.out.println("pozitif  bir sayıdır");
			}

		}

	}
}
