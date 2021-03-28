package com.ecodation.method;

public class MethodTutorials {

	// Voidli Parametresiz
	// parametre
	public static void voidliParametresiz() {
		System.out.println("Hamit Mızrak");
	}

	// Voidli Parametreli
	public static void voidliParametreli(String adi, String soyadi) {
		System.out.println(adi + " " + soyadi);
	}

	// Voidsiz Parametresiz
	public static String voidsizParametresiz() {
		return "Hamit Mızrak";
	}

	// Voidsiz Parametreli
	public static String voidsizParametreli(String adi, String soyadi) {
		return adi + " " + soyadi;
	}

	// overloading
	public static String voidsizParametreli(String adi, String soyadi, int number) {
		return adi + " " + soyadi + " " + number;
	}

	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Hamit", "Mızrak");

		String ad1 = voidsizParametresiz();
		System.out.println(ad1);

		// argüman
		String ad2 = voidsizParametreli("Hamit", "Mızrak");
		System.out.println(ad2);

	}

}
