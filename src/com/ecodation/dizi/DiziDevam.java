package com.ecodation.dizi;

import java.util.Arrays;

public class DiziDevam {

	public static void main(String[] args) {
		int[] dizi = { 5, 2, 3, 1, 0, 4 };
		Arrays.sort(dizi);
		for (int tempInt : dizi) {
			System.out.print(tempInt + " ");
		}

	}
}
