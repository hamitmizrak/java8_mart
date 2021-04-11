package com.ecodation.filex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AllFileMethods {
	// file oluşturma
	public void fileCreateMethod() {
		String yeniPath = FileStaticPath.getStatcPath();
		try {
			FileInformation information = new FileInformation();
			information.setPath(yeniPath);
			File file = new File(information.getPath());
			if (file.createNewFile()) {
				System.out.println(file.getAbsolutePath() + "  dosya oluşturuldu.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// file silme
	public void fileDelete() {
		String yeniPath = FileStaticPath.getStatcPath();
		try {
			FileInformation information = new FileInformation();
			File file = new File(yeniPath);
			if (file.exists()) {
				System.out.println("Dosyanız siliniyor.");
				file.delete();
			} else {
				System.out.println("Dosya bulunamadı ve " + "Dosya silinemedi");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		}

	}

	// file yazma
	public void fileWriter() {
		String path = FileStaticPath.getStatcPath();
		File file = new File(path);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			Scanner klavye = new Scanner(System.in);
			System.out.println("Yazmak istediğiniz kelimeyi giriniz");
			String value = klavye.nextLine();
			bufferedWriter.write("\n" + value);
			bufferedWriter.flush();
			System.out.println("Veriler yazıldı");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// / Linux
	// \ Windows

	// file okuma
	public void fileReader() {
		String path = FileStaticPath.getStatcPath();
		try {
			String toplam = "";
			String satir = "";
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedWriter = new BufferedReader(fileReader);
			while ((satir = bufferedWriter.readLine()) != null) {
				toplam += satir;
			}
			// database
			// web servisler
			// comsole yazdırım
			System.out.println(toplam);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// file genel bilgiler

}
