package com.ecodation.dizi;

public class Diziler {

	public static void main(String[] args) {

		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13);

		// sıfırdan başlar.
		int[] diziAdi = new int[10]; // 10-1=9
		diziAdi[0] = 0;
		diziAdi[2] = 2;
		diziAdi[9] = 9;
		diziAdi[1] = 1;
		diziAdi[3] = 355;
		diziAdi[4] = 4;
		diziAdi[5] = 5;
		diziAdi[6] = 6;
		diziAdi[7] = 7;
		diziAdi[8] = 8;

		// System.out.println(diziAdi[3]);
		for (int temp : diziAdi) {
			System.out.println(temp);
		}
	}

}
