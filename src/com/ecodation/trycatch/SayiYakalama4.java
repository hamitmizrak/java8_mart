package com.ecodation.trycatch;

import java.io.IOException;

public class SayiYakalama4 {

	public static void method1() throws IOException, ArrayIndexOutOfBoundsException, ArithmeticException, Exception {

		System.out.println("1.alan");

		int sayi = 4 / 0;
		System.out.println("2.alan");
	}
a
	public static void deneme() {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
