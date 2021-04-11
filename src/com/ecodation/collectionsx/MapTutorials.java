package com.ecodation.collectionsx;

import java.util.HashMap;
import java.util.Map;

public class MapTutorials {
	public static void main(String[] args) {
		// H H L T
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("1", "Turkiye");
		mapList.put("2", "Almanya");
		mapList.put("3", "Afrika");
		// KEV
		for (String key : mapList.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println("\n----------");
		for (Object key : mapList.values()) {
			System.out.print(key + " ");
		}

		System.out.println("\n----------");
		for (Object key : mapList.entrySet()) {
			System.out.print(key + " ");
		}
		System.out.println("\n----------");
		// M.eg.L.e.s
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.println(temp);

		}

	}
}
