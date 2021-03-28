package com.ecodation.common;

public class Ders_012_break_return_continue {

	public static void main(String[] args) {

		// 0 ile 500 arasındaki sayılar olsun (0 ve 500 dahil)
		// 1-) 2 şer 2 şer artsın.
		// 2-) birer birer artsın.(aşağıdaki kodlar 1 er 1 er artarak devam edecek)
		// 3-) eğer bu sayılardan 11 varsa döngü çalışmasın(dursun).
		// 4-) eğer bu sayılardan 9 varsa o anda çalışmasın ama döngü devam etsin.

		for (int i = 0; i <= 500; i += 1) {
			if (i == 9)
				continue;
			if (i == 11)
				break;
			System.out.print(i + " ");

		}
		System.out.println("\n---------------------------------");
		// 1<=x<=15 tane sayı topla
		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15);

		int toplam = 0;
		for (int i = 0; i <= 15; i++) {
			toplam += i;
		}
		System.out.println(toplam);

	}

}
