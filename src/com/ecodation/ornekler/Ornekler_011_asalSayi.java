package com.ecodation.ornekler;

import java.util.Scanner;

//asal sayı: 1 ve kendisine bölünebilen sayılara denir. en küçük ve tek çift asal sayı: 2

public class Ornekler_011_asalSayi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		while (10 > 1) {
			System.out.println("Asal sayı için bir sayı giriniz\n");
			int sayi = klavye.nextInt();
			boolean karar = false;

			if (sayi <= 1) {
				System.out.println("2 küçük sayılar asal olamaz");
			} else {
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0)
						karar = true;
				}

				if (karar) {
					System.out.println("asal sayı değildir");
				} else {
					System.out.println("asal sayıdır");
				}
			}
		}
	}
}
