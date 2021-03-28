package com.ecodation.common;

public class Ders_014_try_catch_throw {
	public static void main(String[] args) {

		System.out.println("1.satır");
		try {
			int a = 3 / 0; // tanımsız
			System.out.println("hata varrrrr");
		} catch (ArithmeticException ae) {
			System.out.println(ae.getCause());
		} catch (Exception e) {
			// System.out.println("1250 hatası admine başvurun. ");
			// System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("mail gider");
		} finally {
			System.out.println("hata varrrrr");
		}

		System.out.println("son satır");

	}
}
