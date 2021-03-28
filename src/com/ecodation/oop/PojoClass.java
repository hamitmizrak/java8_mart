package com.ecodation.oop;

//pojo = nesne değişkeni+ setter and getter
public class PojoClass {

	// nesne değişkenleri
	private long id;
	private String adi;
	private String soyadi;

	// getter ands setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}
