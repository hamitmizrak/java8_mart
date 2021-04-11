package com.ecodation.collectionsx;

public class CollectionsTutorials {

	public static void main(String[] args) {
		int[] dizi = new int[5];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}

		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
	}

}
