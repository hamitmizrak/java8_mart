package com.ecodation.common;

public class Ders_001_Operatorler {

	public static void main(String[] args) {
		// aritmetik işlemler
		int dortIslem = (4 * 2 + 5 / 5 - 9 * (9 * 2 - 4 / 4 - 8 * 9));
		System.out.println(dortIslem);

		// ------------------- Primitive Types------------------------------
		// tam sayı
		byte b1 = 44;
		short s1 = 130;
		int i1 = 500;
		long l1 = 4525526252L;

		// virgüllü sayı
		float f2 = 44.55f;
		double d2 = 525252.5525;

		char c3 = '@';
		char c4 = '\u5632';
		int convert = (int) c4;

		System.out.println(c4);
		System.out.println(convert);

		boolean b3 = true;
		b3 = 4 < 2; // false

	}

}
