package com.ecodation.ornekler;

//toplamları,çarpmaları,çıkarmak,bölme
//8 4
//12
//32
//4
//2

public class Ornekler_004_hesapMakinasi {
	public static void main(String[] args) {
		double toplam, cikarma, carpma, bolme, a, b;
		a = 8;
		b = 4;
		toplam = a + b;
		cikarma = a - b;
		carpma = a * b;
		bolme = a / b;
		System.out.println("toplam: " + toplam + "\n" + "cikarma: " + cikarma + "\n" + "carpma: " + carpma + "\n"
				+ "bölme:" + bolme);

		System.out
				.println(" toplam: " + (a + b) + " cikarma: " + (a - b) + " carpma: " + (a * b) + " bolme: " + (a / b));
	}
}
