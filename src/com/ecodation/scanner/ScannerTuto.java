package com.ecodation.scanner;

//import java.util.*;
import java.util.Scanner;

public class ScannerTuto {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		// java.util.Scanner klavye2 = new Scanner(System.in);

		System.out.println("Lütfen adını soyadınızı giriniz");
		String adSoyad = klavye.nextLine(); // String anlamındadır
		System.out.println("girdiğiniz ad soyad: " + adSoyad);

		System.out.println("bildiğiniz diller");
		long diller = klavye.nextLong();
		System.out.println("bildiğiniz diller: " + diller);

	}
}
