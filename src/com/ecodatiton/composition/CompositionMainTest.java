package com.ecodatiton.composition;

import java.util.ArrayList;

public class CompositionMainTest {
	public static void main(String[] args) {

		// kim olmazsa olmaz: Oğretmen
		Ogretmen ogretmen = new Ogretmen(44, "Hamit", "Mızrak", "Malatya");
		ogretmen.setOgrencilerList(new ArrayList<Ogrenciler>());

		Ogrenciler ogrenciler = new Ogrenciler(11, "isim", "soyisim", "memleket-1");
		ogrenciler.setOgretmen(ogretmen);
		ogretmen.getOgrencilerList().add(ogrenciler);

		System.out.println(ogretmen);
		System.out.println(ogrenciler);

	}
}
