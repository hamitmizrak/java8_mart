package com.ecodatiton.composition2;

import java.util.ArrayList;

public class CompositionMainTest {

	public static void main(String[] args) {

		// kim olmazsa olmaz
		Usta usta = new Usta(1, "usta ad", "usta soyad", "usta sertifakasi x55");
		usta.setCirakList(new ArrayList<Cirak>());

		Cirak cirak = new Cirak(100, "cirak Ad", "cirak Soyad", "cirak Çirak sertifikası");
		cirak.setUsta(usta);
		usta.getCirakList().add(cirak);

		Cirak cirak2 = new Cirak(100, "cirak Ad2", "cirak Soyad2", "cirak Çirak sertifikası2");
		cirak2.setUsta(usta);
		usta.getCirakList().add(cirak2);

		Cirak cirak3 = new Cirak(100, "cirak Ad3", "cirak Soyad3", "cirak Çirak sertifikası3");
		cirak3.setUsta(usta);
		usta.getCirakList().add(cirak3);

		System.out.println(usta);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(cirak);
		System.out.println(cirak2);
		System.out.println(cirak3);
	}

}
