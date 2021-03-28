package com.ecodation.ornekler;

import java.util.Scanner;

//kullanıcı tarafından başlangıç,bitiş verilsin
//s1-)  başlangıç,bitiş sayıların toplamı
//s2-)  başlangıç,bitiş çift  sayıların toplamı
//s2-)  başlangıç,bitiş  kadar teksayılar  sayıların toplamı
//s3-)  başlangıç,bitiş sayıların toplamı ancak 5'e bölünebilen sayılar hariç

public class Ornekler_009_hesapMakinasi {
	public static void main(String[] args) {
		int sayi1, sayi2;
		Scanner klavye = new Scanner(System.in);

		System.out.println("1.sayı");
		sayi1 = klavye.nextInt();

		System.out.println("2.sayı");
		sayi2 = klavye.nextInt();

		System.out.println("toplamları: " + (sayi1 + sayi2));
		System.out.println("cikarma: " + (sayi1 - sayi2));
		System.out.println("carpma: " + (sayi1 * sayi2));
		System.out.println("bolme: " + (sayi1 / sayi2));

	}
}
