package com.ecodation.ornekler;

import java.util.Scanner;

//kullanıcı tarafından başlangıç,bitiş verilsin
//s1-)  başlangıç,bitiş sayıların toplamı
//s2-)  başlangıç,bitiş çift  sayıların toplamı
//s2-)  başlangıç,bitiş  kadar teksayılar  sayıların toplamı
//s3-)  başlangıç,bitiş sayıların toplamı ancak 5'e bölünebilen sayılar hariç

public class Ornekler_010_vizeFinal {
	public static void main(String[] args) {
		double vizeNot, finalNot, sonuc;
		Scanner klavye = new Scanner(System.in);

		System.out.println("Vize notunuzu giriniz");
		vizeNot = klavye.nextDouble();

		System.out.println("Final notunuzu giriniz");
		finalNot = klavye.nextDouble();

		sonuc = (vizeNot * 40 / 100) + (finalNot * 60 / 100);

		if (0 <= sonuc && sonuc <= 59) {
			System.out.println("Kaldınız");
		} else if (60 <= sonuc && sonuc <= 69) {
			System.out.println("DC" + " ortalamanız: " + sonuc);
		} else if (70 <= sonuc && sonuc <= 79) {
			System.out.println("CC" + " ortalamanız: " + sonuc);
		} else if (80 <= sonuc && sonuc <= 89) {
			System.out.println("BA" + " ortalamanız: " + sonuc);
		} else if (90 <= sonuc && sonuc <= 100) {
			System.out.println("AA" + " ortalamanız: " + sonuc);
		} else {
			System.out.println("yanlış sayılar girdiniz");
		}

	}
}
