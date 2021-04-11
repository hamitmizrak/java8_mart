package com.ecodation.collectionsx;

import java.util.Set;
import java.util.TreeSet;

public class SetTutotials {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(40);
		set.add(30);

		for (int temp : set) {
			System.out.print(temp + " ");
		}
	}

}
