package com.ecodation.uml;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 5681999393452035603L;

	// değişkenler
	private int personId;
	private String adi;
	private String soyadi;
	public String adres;
	public boolean sehir;
	private static int sabitSayi;
	public double pi;
	// parametresiz constructor
	// parametreli constructor
	// toString constructor

	// Metotlar
	public void fullName1() {
	}

	public void fullName2(int a, int b) {
	}

	public boolean fullName3(int a, int b, int c) {
		return false;
	}

	// getter and setter

}