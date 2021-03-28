package com.ecodation.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Takvim {

	public static void main(String[] args) {

		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss", locale);

		Calendar date = Calendar.getInstance();
		String cevir = dateFormat.format(date.getTime());
		System.out.println(cevir);

	}

}
