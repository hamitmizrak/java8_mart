package com.ecodation.dizi;

public class DiziOrnegi {

	public static void main(String[] args) {
		// dizi kullanılacak 1+2+3+4+5+6+7 ..... 1000 diziye atanacak
		// dizi[100]+dizi[200]+dizi[300]+dizi[400]+dizi[499]= 100+200+300+400+500=3000
		int[] dizi = new int[5];
		int toplam = 0;
		int diger = 0;
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
			toplam += dizi[i];
		}
		System.out.println(toplam);
		System.out.println(dizi[5]);

	}
}
