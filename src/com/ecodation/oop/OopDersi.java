package com.ecodation.oop;

import java.io.Serializable;

// bean=pojo+constructor+serizable
public class OopDersi implements Serializable {
	private static final long serialVersionUID = 5773105596590777681L;

	// nesne değişkenleri
	private long id;
	private String adi;
	private String soyadi;

	// parametresiz constructor new ile bu class oluşturulduğunda ilk buraya uğrar.
	// Ctrl+Space
	public OopDersi() {

	}

	// Shift+Alt+S
	// parametreli constructor
	public OopDersi(long id, String adi, String soyadi) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	// Shift+Alt+S
	// toSting = classın kısa bir kimliğidir.
	@Override
	public String toString() {
		return "OopDersi [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}

	// methodlar
	public void fullName() {
		System.out.println(this.adi + " " + this.soyadi);
	}

	public int toplam(int x, int y, int z) {
		int k = x + y + z;
		return k;
	}

	// Shift+Alt+S
	// getter and setter

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
