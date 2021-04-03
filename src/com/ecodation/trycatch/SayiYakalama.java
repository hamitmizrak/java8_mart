package com.ecodation.trycatch;

public class SayiYakalama {

	public static void main(String[] args) {

		System.out.println("1.alan");

		try {
			int sayi = 4 / 0;
		} catch (ArithmeticException ar) {
			System.out.println("Hata meydana geldi " + ar);
			// System.out.println(ar.getMessage());
			// ar.printStackTrace();
			ePostaGonder();
		} catch (Exception e) {
		} finally {
			System.out.println("içerdeki alan");
		}
		System.out.println("2.alan");
	}

	private static void ePostaGonder() {
		System.out.println("Mail gönderildi ......");

	}

}
