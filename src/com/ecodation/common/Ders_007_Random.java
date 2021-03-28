package com.ecodation.common;

import java.util.Random;

public class Ders_007_Random {

	public static void main(String[] args) {

		System.out.println(Math.round(Math.random() * 3 + 1));

		Random random = new Random();
		int sayilar = random.nextInt(3) + 1;
		System.out.println(sayilar);

	}

}
