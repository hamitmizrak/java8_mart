package com.ecodation.ornekler;

import java.util.Scanner;

//Kullanıcı Tarafından Girilen İki Sayının  dört işlem

public class Ornekler_006_password_repassword {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String sifre1, sifre2;

		System.out.println("lütfen şifrenizi giriniz");
		sifre1 = klavye.nextLine();

		System.out.println("lütfen şifrenizi tekrar giriniz");
		sifre2 = klavye.nextLine();

		if (sifre1.equals(sifre2)) {
			System.out.println("Şifreler eşleşti");
		} else {
			System.out.println("Şifreler EŞLEŞMEDİ ...");
		}

		klavye.close();

		Scanner klavye2 = new Scanner(System.in);

	}
}
