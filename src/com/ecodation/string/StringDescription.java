package com.ecodation.string;

public class StringDescription {

	public static void main(String[] args) {

		String kelime = "Java SE ";
		System.out.println(kelime);
		System.out.println("boyutu: " + kelime.length());
		System.out.println("trimli: " + kelime.trim().length());
		System.out.println(kelime.toUpperCase());
		System.out.println(kelime.toLowerCase());
		System.out.println("başlama: " + kelime.startsWith("J"));
		System.out.println("bitiş: " + kelime.endsWith("E"));
		System.out.println("boş mu: " + kelime.isEmpty());
		System.out.println(kelime.substring(1)); // sıfırdan başlar
		System.out.println(kelime.substring(1, 3)); // 1<=x<=(3-1)
		System.out.println(kelime + "Hamit Mızrak");
		System.out.println(kelime.concat("Hamit Mızrak"));
		System.out.println(kelime.charAt(1));
		System.out.println(kelime.indexOf("J"));
		System.out.println("karşılaştır: " + kelime.compareTo("Java SE ")); // objecleri karşılaştırmak
		System.out.println("karşılaştır: " + kelime.equals("Java SE ")); // String verileri karşılaştırma
		System.out.println("karşılaştır....: " + (kelime == "Java SE ")); // String verileri karşılaştırma
		System.out.println("içinde:  " + kelime.contains("J"));
		System.out.println(kelime.replace(kelime, "Java SE-EE "));
		//
		System.out.println();

		String[] array = kelime.split(" ");
		for (String temp : array) {
			System.out.println(temp + " ");
		}

	}
}
