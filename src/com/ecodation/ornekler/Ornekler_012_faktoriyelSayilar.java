package com.ecodation.ornekler;

import java.util.Scanner;

//faktöriyel=4.3.2.1    0!=1  1!=1 2!=2   negatif sayılar faktöriyel olamaz

public class Ornekler_012_faktoriyelSayilar {
	public static void main(String[] args) {

		// @Deprecated
		int sayi, sonuc = 1;
		Scanner klavye = new Scanner(System.in);

		while (12 > -5) {
			System.out.println("Faktöriyel için bir sayı giriniz");
			sayi = klavye.nextInt();

			if (sayi < 0) {
				System.out.println("sıfırdan küçük faktöriyel yoktur");
			} else if (sayi == 0 || sayi == 1) {
				System.out.println(sayi + " sayısı sonucu: 1");
			} else {
				for (int i = sayi; i > 0; i--) {
					sonuc = sonuc * i;
				}
				System.out.println("faktöriyel sonuc: " + sonuc);
				sonuc = 1;
			}

		}

	}
}
