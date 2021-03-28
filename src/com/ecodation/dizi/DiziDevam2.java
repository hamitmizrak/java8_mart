package com.ecodation.dizi;

public class DiziDevam2 {

	public static void main(String[] args) {
		// Object[][] dizi = new Object[2][2];
		int[][] dizi = new int[2][2];
		dizi[0][0] = 0;
		dizi[0][1] = 1;
		dizi[1][0] = 2;
		dizi[1][1] = 3;
		// System.out.println(dizi[1][1]);

		// length
		for (int i = 0; i < 2; i++) { // satır için
			for (int j = 0; j < 2; j++) {// sutun için
				System.out.print("arr[" + i + "][" + j + "] = " + dizi[i][j] + " ");
			}
			System.out.println();
		}

		// length
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j]);
			}
			System.out.println();
		}
	}
}
