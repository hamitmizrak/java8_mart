package com.ecodation.dizi;

import java.util.Arrays;

public class DiziKopyalama {

	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5 }; // Tek=1+3+5=9 Çift=2+4=6
		int[] dizi2 = new int[dizi1.length];

		// clone
		for (int i = 0; i < dizi1.length; i++) {
			dizi2[i] = dizi1[i];
		}

		for (int temp : dizi2) {
			System.out.print(temp + " ");
		}
		Arrays.sort(dizi2);

		// tek sayıların toplamı / çift sayıların toplamını
		// clonelanmış dizilerde çift sayılar ve tek sayılar
		int ciftToplam = 0, tekToplam = 0;
		for (int i = 0; i < dizi2.length; i++) {
			if (dizi2[i] % 2 == 0) {
				ciftToplam += dizi2[i];
			} else {
				tekToplam += dizi2[i];
			}

		}
		System.out.println("\nÇift toplam: " + ciftToplam);
		System.out.println("Tek toplam: " + tekToplam);
	}
}
