package com.ecodation.oop;

public class PojoMainTest {

	public static void main(String[] args) {
		PojoClass pojoClass = new PojoClass();
		pojoClass.setAdi("Hamit");
		pojoClass.setId(44);
		pojoClass.setSoyadi("Mızrak");

		System.out.println(pojoClass.getId() + " " + pojoClass.getAdi() + " " + pojoClass.getSoyadi());

	}
}
