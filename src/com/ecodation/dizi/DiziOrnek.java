package com.ecodation.dizi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//konsoldan kaç elemanlı  bir dizi olacağını, rastgele sayı için başlangıç ve bitişi consolden
//ve bu elemanlara rastgele bilgisayar tarafında sayılar girecek
//-a) bu sayıları bir diziye atayalım
//-b) rastgele gelen sayıları küçükten büyüğe sıralıyalım ?
//-c) ilk sayı ile son sayının toplamını alalım.
//-d) bütün sayıların toplamı ?
//-e) ortalaması ?
//-f) bütün sayı toplamını  metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.

public class DiziOrnek {

	public void genel() {

		Scanner klavye = new Scanner(System.in);
		int diziEleman, baslangic, bitis;

		System.out.println("dizi eleman sayısısını giriniz");
		diziEleman = klavye.nextInt();

		System.out.println("rastgele  başlangıç sayısını giriniz");
		baslangic = klavye.nextInt();

		System.out.println("rastgele  bitiş sayısını giriniz");
		bitis = klavye.nextInt();

		Random random = new Random();

		int rastgele;
		// System.out.println(rastgele);

		int[] dizi = new int[diziEleman];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = random.nextInt(bitis) + baslangic;
		}
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		System.out.println();
		// +++++++++++++++++++++++++ b şıkkı +++++++++++++++++++++++++++++++++++++++
		// sıralama
		Arrays.sort(dizi);
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		// ++++++++++++++++++++++++++ c şıkkı +++++++++++++++++++++++++++++++++++++
		int ilkSayi, sonSayi;
		ilkSayi = dizi[0];
		sonSayi = dizi[dizi.length - 1];
		System.out.println("\nilk sayı: " + ilkSayi + " son sayı: " + sonSayi);

		// ++++++++++++++++++++++++++ d şıkkı toplam +++++++++++++++++++++++++++++++
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println("toplam sonuc= " + toplam);
		// ++++++++++++++++++++++++++ e şıkkı toplam +++++++++++++++++++++++++++++++
		// toplam/sayi
		int ortalama = toplam / dizi.length;
		System.out.println("ortalama: " + ortalama);

		// ++++++++++++++++++++++++++ f şıkkı toplam +++++++++++++++++++++++++++++++
		sonuc(toplam);
		klavye.close();
	}

	public static void sonuc(int sayi) {
		String sonuc = sayi >= 10 ? "10 büyüktür" : "10 küçüktür";
		System.out.println(sonuc);
		// System.out.println(sayi >= 10 ? "10 büyüktür" : "10 küçüktür");

		// if (sayi > 10) {
		// System.out.println("10 büyüktür");
		// } else {
		// System.out.println("10 küçüktür");
		// }
	}

}
