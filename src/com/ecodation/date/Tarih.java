package com.ecodation.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tarih {

	public static void main(String[] args) {

		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss zzzz", locale);

		Date date = new Date();
		System.out.println(date);
		// date.setMonth(10);
		// System.out.println(date);

		String cevir = dateFormat.format(date);
		System.out.println(cevir);

	}

}
