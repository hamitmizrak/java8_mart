package com.ecodation.common;

public class Ders_002_PrimitiveReferans {

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
		System.err.println("----------------------------------------------------------");

		Byte referans1 = new Byte((byte) 11);
		referans1 = null;
		Short referans2 = new Short((short) 22);
		Integer referans3 = new Integer(22);
		Long referans4 = new Long(33);

		Float referans5 = new Float(44);
		Double referans6 = new Double(55.55);

		Boolean referans7 = new Boolean(true);
		Character referans8 = new Character('a');

		String str = new String("yeni");

	}

}
