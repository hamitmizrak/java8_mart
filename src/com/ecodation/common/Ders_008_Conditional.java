package com.ecodation.common;

public class Ders_008_Conditional {

	public static void main(String[] args) {

		int sayi = 3;

		if (sayi == 3) {
			System.out.println("sayı: 3 tür");
		} else {
			System.out.println("sayı 3'ten farklıdır.");
		}
		System.out.println("++++++++++++++++++++++++++++++++");

		String kelime = "Java Se ME";
		if (kelime.equals("Java")) {
			System.out.println("Java");
		} else if (kelime.equals("Java se")) {
			System.out.println("Java se");
		} else if (kelime.equalsIgnoreCase("Java se me")) {
			System.out.println("Java se me");
		} else if (kelime.equals("Java se me ee ")) {
			System.out.println("Java se me ee");
		} else {
			System.out.println("farklı kelime girdiniz");
		}

		System.out.println("-------------");
		String sonuc = sayi == 3 ? "sayı: 3 tür" : "sayı 3'ten farklıdır.";
		System.out.println(sonuc);

	}

}
