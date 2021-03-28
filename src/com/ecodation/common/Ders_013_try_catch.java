package com.ecodation.common;

public class Ders_013_try_catch {
	public static void main(String[] args) {

		System.out.println("1.satır");
		try {
			int a = 3 / 0; // tanımsız
			throw new ArithmeticException("Sıfıra bölemezsin");
		} catch (Exception e) {
			System.out.println("mail gider");
			throw (e);
		}

	}
}
