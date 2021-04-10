package com.ecodation.filex;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileTutorials {
	public static void main(String[] args) {

		try {
			String pathname = "C:\\fileIO\\8grup.txt";
			File file = new File(pathname);

			if (file.createNewFile()) {
				System.out.println("dosya yoktur dosya oluşturuldu");
			} else {
				System.out.println("dosya zaten var ");
			}

			System.out.println("çalışma iznim var mı: " + file.canExecute());
			System.out.println("okuma iznim var mı: " + file.canRead());
			System.out.println("yazma iznim var mı: " + file.canWrite());

			System.out.println("dosya mı " + file.isFile());
			System.out.println("dizin mi " + file.isDirectory());
			System.out.println("gizli mi" + file.isHidden());

			System.out.println("ebeveyn: " + file.getParent());
			System.out.println("bütün yol" + file.getPath());
			System.out.println(file.getClass());
			System.out.println(file.getParentFile());
			System.out.println(file.getFreeSpace());
			System.out.println(file.getTotalSpace());
			System.out.println(file.getAbsolutePath());

			//// silmeden önce dosya var mı diye kontrol edelim
			// if (file.exists()) {
			// System.out.println(file.delete());
			// } else {
			// System.out.println("dosya yoktur");
			// }

			// değiştime tarihini Türkçe olarak değiştirdim
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss", locale);
			Date date = new Date(file.lastModified());
			String donus = dateFormat.format(date);
			System.out.println(donus);

			System.out.println(file.lastModified());

			System.out.println(file.length());
			boolean sonuc = file.renameTo(file);

			// www.hamitmizrak.com = sabit IP
			System.out.println(file.toURL());

			// www.hamitmizrak.com/resim/1.jpg
			System.out.println(file.toURI());
		} catch (IOException io) {
			io.printStackTrace();
		}

	}
}
