package com.ecodation.enumsx;

public class OlcuMainTest {
	public static void main(String[] args) {

		EOlcu eOlcu = EOlcu.kucuk;

		String deneme = EOlcu.buyuk.toString();
		System.out.println(deneme);

		System.out.println(eOlcu.ordinal());

		System.out.println("-------------");

		for (EOlcu temp : EOlcu.values()) {
			System.out.println(temp);
		}

	}
}
