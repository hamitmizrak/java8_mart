package com.ecodation.collectionsx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTutorials {

	public static void main(String[] args) {

		List<String> ulke2 = new ArrayList<String>();
		ulke2.add("Afganistan");
		ulke2.add("Mısır");
		ulke2.add("Afrika");

		List<String> ulke = new LinkedList<String>();
		ulke.add("Türkiye");
		ulke.add("Almanya");
		ulke.add("Fransa");

		for (String temp : ulke) {
			System.out.print(temp + " ");
		}
		System.out.println("\n------------------");

		ulke.addAll(ulke2);
		for (String temp : ulke) {
			System.out.print(temp + " ");
		}
		System.out.println("\n------------------");
		ulke.remove(0);
		for (String temp : ulke) {
			System.out.print(temp + " ");
		}

		System.out.println("\n------------------");
		// ulke.clear();

		System.out.println(ulke.size());
		System.out.println(ulke.contains("Almanya"));
		boolean result = ulke.equals(ulke2);
		System.out.println("eşit mi? " + result);

		System.out.println(ulke.get(0));

		System.out.println(ulke.isEmpty());

	}
}
