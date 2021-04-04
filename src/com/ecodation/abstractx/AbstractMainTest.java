package com.ecodation.abstractx;

public class AbstractMainTest {

	public static void main(String[] args) {
		Hayvanlar hayvanlar = new Kaplan(); // polymorphism
		hayvanlar.adSoyad(); // polymorphism

		Sahin sahin = new Sahin();
		sahin.adSoyad(); // polymorphism

		Ayi ayi = new Ayi();
		ayi.adSoyad(); // polymorphism

		Kaplan kaplan = new Kaplan();
		kaplan.adSoyad(); // polymorphism
	}
}
