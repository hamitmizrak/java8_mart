package com.ecodation.collectionsx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapTogether {

	public static void main(String[] args) {
		List<String> iller = new ArrayList<String>();
		iller.add("Malatya");
		iller.add("Elazığ");
		iller.add("Diyarbakır");
		iller.add("İstanbul");
		iller.add("Ankara");
		// iller = Collections.unmodifiableList(iller);
		iller.add("Kastamanu");
		Collections.sort(iller);
		// lambda expression
		iller.forEach(System.out::println);

		System.out.println("----------------------------------------------");
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("1", "Turkiye");
		mapList.put("2", "Almanya");
		mapList.put("3", "Afrika");
		mapList.entrySet().forEach(System.out::println);
	}
}
