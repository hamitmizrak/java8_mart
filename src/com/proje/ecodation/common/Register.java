package com.proje.ecodation.common;

import java.util.Scanner;

import com.proje.ecodation.dao.AdminDao;
import com.proje.ecodation.dto.AdminDto;

public class Register {

	public void checkConsole() {
		String email, sifre;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen email giriniz");
		email = klavye.nextLine();
		System.out.println("Lütfen şifrenizi giriniz");
		sifre = klavye.nextLine();

		login(email, sifre);

	}

	// register
	public void login(String email, String sifre) {
		// default (DB)
		String dbEmail = "123", dbSifre = "123";

		if (email.equals(dbEmail) && sifre.equals(dbSifre))
			successLogin();
		else
			failLogin();

	}

	private void failLogin() {
		System.out.println("Başarısız");

	}

	private void successLogin() {
		System.out.println("Başarılı Admin sayfasına yönlendiriliyorsunuz ...");
		while (true) {
			Scanner klavye = new Scanner(System.in);
			System.out.println("lütfen seçim yapınız");
			System.out.println("1-)Admin listele \n2-)Admin ekle\n3-)Admin Sil\n4-)Admin Güncelle\n5-)Çıkış yap");
			int key;
			key = klavye.nextInt();

			switch (key) {
				case 1:
					System.out.println("**********************************");
					productList();

					break;
				case 2:
					System.out.println("**********************************");
					productAdd();
					break;
				case 3:
					System.out.println("**********************************");
					productDelete();
					break;
				case 4:
					System.out.println("**********************************");
					productUpdate();
					break;
				case 5:
					System.out.println("Çıkış yapılıyor");
					System.exit(0);
					break;

				default:
					System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
					break;
			}
		}

	}

	private void productUpdate() {
		System.out.println("Admin Güncelleme");
		productList();
		Scanner klavye = new Scanner(System.in);

		String adi, soyadi, email, sifre;
		long id;
		System.out.println("Güncellenecek Admin adını giriniz");
		adi = klavye.nextLine();
		System.out.println("Güncellenecek Admin soyadi giriniz");
		soyadi = klavye.nextLine();
		System.out.println("Güncellenecek Admin email giriniz");
		email = klavye.nextLine();
		System.out.println("Güncellenecek Admin sifre giriniz");
		sifre = klavye.nextLine();

		System.out.println("Güncellenecek id");
		id = klavye.nextLong();

		AdminDto adminDto = new AdminDto(id, adi, soyadi, email, sifre);
		AdminDao adminDao = new AdminDao();
		adminDao.update(adminDto);

	}

	private void productDelete() {
		System.out.println("Admin Silmek");
		productList();
		long id;
		Scanner klavye = new Scanner(System.in);
		System.out.println("silmek istediğiniz id giriniz");
		id = klavye.nextLong();
		AdminDao adminDao = new AdminDao();
		adminDao.delete(id);
		System.out.println("****************Silmeden sonraki liste*****************");
		productList();

	}

	private void productAdd() {
		System.out.println("Admin Ekleme");
		Scanner klavye = new Scanner(System.in);
		String adi, soyadi, email, sifre;
		System.out.println("Admin adını giriniz");
		adi = klavye.nextLine();
		System.out.println("Admin soyadi giriniz");
		soyadi = klavye.nextLine();
		System.out.println("Admin email giriniz");
		email = klavye.nextLine();
		System.out.println("Admin sifre giriniz");
		sifre = klavye.nextLine();

		AdminDto adminDto = new AdminDto(adi, soyadi, email, sifre);
		AdminDao adminDao = new AdminDao();
		adminDao.create(adminDto);
	}

	private void productList() {
		System.out.println("Admin Listeleme");
		AdminDao adminDao = new AdminDao();
		for (AdminDto temp : adminDao.list()) {
			System.out.println(temp);
		}
	}

}
