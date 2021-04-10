package com.ecodation.enumsx;

public class OlcuConstructorMainTest {

	public static void main(String[] args) {

		EOlcuConstructor olcu = EOlcuConstructor.KUCUK;
		System.out.println("sıra: " + olcu.ordinal());
		System.out.println("id:" + olcu.getId());
		System.out.println(olcu.getDeger());

		String cevir = EOlcuConstructor.BUYUK.toString();
		System.out.println(cevir);

		for (EOlcuConstructor temp : EOlcuConstructor.values()) {
			System.out.println(temp);
		}

	}

}
