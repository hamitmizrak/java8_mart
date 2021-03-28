package com.ecodation.ornekler;

import java.util.Scanner;

//Kullanıcı Tarafından Girilen İki Sayının  dört işlem

public class Ornekler_005_scanner {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;

		System.out.println("lütfen 1.sayıyı giriniz");
		sayi1 = klavye.nextInt();

		System.out.println("lütfen 2.sayıyı giriniz");
		sayi2 = klavye.nextInt();

		System.out.println("toplamları: " + (sayi1 + sayi2));
		System.out.println("cikarma: " + (sayi1 - sayi2));
		System.out.println("çarpma: " + (sayi1 * sayi2));
		System.out.println("bölme: " + (sayi1 / sayi2));

	}
}
