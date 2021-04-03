package com.ecodation.decoderencoder;

import java.util.Scanner;

public class Klavye {

	public String getKlavye() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz");
		String kelime = klavye.nextLine();
		return kelime;
	}
}
