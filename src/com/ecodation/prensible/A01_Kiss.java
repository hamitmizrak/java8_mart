package com.ecodation.prensible;

public class A01_Kiss {

	public static void carpim(int sayi1, int sayi2) {
		System.out.println(sayi1 * sayi2);
	}

	public static void carpim2(int sayi1, int sayi2) {
		System.out.println(sayi1 * sayi2);
		System.out.println("Deneme");
	}

	public static void main(String[] args) {
		// KISS (Keep It Simple, Stupid)
		// mümkün olduğunca en basit yöntemi seçerek çözüme ulaşmalısın.
		int x = 5;
		int y = 10;
		int z = x + y;
		// System.out.println(z);
		// System.out.println(5 + 10);

		// DRY (Dont Repeat Yourself)
		int x2 = 10;
		int y2 = 10;
		int z2 = x2 * y2;
		System.out.println(z2);

		int x3 = 13;
		int y3 = 10;
		int z3 = x3 * y3;
		System.out.println(z3);
		carpim(10, 9);

	}

}
