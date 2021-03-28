package com.ecodation.cast;

public class Cast_Donusum {

	public static void main(String[] args) {

		// cast ==> sayıları String , String == sayılara
		byte b1 = 122;
		int i1 = b1;

		// büyük olanı küçük olana yerleştirelim.
		long l2 = 4554L;
		byte b2 = (byte) l2;

		// Boxing = primitive olanı Referans olana çevirmek
		int i3 = 44;
		Integer i4 = i3; // boxing (cast)

		// unboxing = Referans olanı primitive olanı çevirmek
		Double d5 = new Double(44.55);
		double d6 = d5;

		// String'i sayıya çevir
		String str2 = "44";
		System.out.println(str2 + 6);
		int sayi2 = Integer.valueOf(str2);
		System.out.println(sayi2 + 6);

		// sayıyı String'e çevir
		int sayi5 = 66;
		System.out.println(sayi5 + 4);
		String str5 = String.valueOf(sayi5);
		System.out.println(str5 + 4);

	}
}
