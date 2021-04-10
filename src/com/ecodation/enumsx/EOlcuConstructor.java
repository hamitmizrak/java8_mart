package com.ecodation.enumsx;

public enum EOlcuConstructor {

	KUCUK(1, "kucuk"), ORTA(2, "orta"), BUYUK(3, "buyuk");

	private final long id;
	private final String deger;

	// parametreli constructor
	private EOlcuConstructor(long id, String deger) {
		this.id = id;
		this.deger = deger;
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public String getDeger() {
		return deger;
	}

}
