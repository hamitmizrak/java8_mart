package com.ecodation.collectionsx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTutorials2 {
	public static void main(String[] args) {
		// H H L T
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("1", "Turkiye");
		mapList.put("2", "Almanya");
		mapList.put("3", "Afrika");

		Set setKey = mapList.keySet();
		Iterator ite = setKey.iterator();
		while (ite.hasNext()) {
			// System.out.println(ite.next());
			System.out.println(mapList.get(ite.next()));
		}

		// System.out.println(mapList.get(1));

	}
}
