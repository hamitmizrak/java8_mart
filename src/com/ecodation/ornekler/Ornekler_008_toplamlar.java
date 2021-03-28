package com.ecodation.ornekler;

import java.util.Scanner;

//kullanıcı tarafından başlangıç,bitiş verilsin
//s1-)  başlangıç,bitiş sayıların toplamı
//s2-)  başlangıç,bitiş çift  sayıların toplamı
//s2-)  başlangıç,bitiş  kadar teksayılar  sayıların toplamı
//s3-)  başlangıç,bitiş sayıların toplamı ancak 5'e bölünebilen sayılar hariç

public class Ornekler_008_toplamlar {
	public static void main(String[] args) {
		int baslangic, bitis, butunToplam = 0, ciftToplam = 0, tektoplam = 0, besToplam = 0, sonuc;
		Scanner klavye = new Scanner(System.in);

		System.out.println("başlangıç sayısını yazınız");
		baslangic = klavye.nextInt();

		System.out.println("bitis sayısını yazınız");
		bitis = klavye.nextInt();

		for (int i = baslangic; i <= bitis; i++) {
			butunToplam = butunToplam + i;
			if (i % 2 == 0) {
				ciftToplam += i;
			}
			if (i % 2 == 1) {
				tektoplam += i;
			}
			if (i % 5 == 0) {
				besToplam += i;
			}
		}

		sonuc = butunToplam - besToplam;

		System.out.println("toplam sonucu: " + butunToplam);
		System.out.println("çift sayı toplam sonucu: " + ciftToplam);
		System.out.println("tek sayı toplam sonucu: " + tektoplam);
		System.out.println("5 sayılar haric toplam sonucu: " + sonuc);

	}
}
