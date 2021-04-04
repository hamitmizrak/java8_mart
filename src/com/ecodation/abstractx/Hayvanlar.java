package com.ecodation.abstractx;

//bean
abstract public class Hayvanlar {

	// nesne değişkenleri
	private long abstractId;
	private String adi;
	private String soyadi;

	// parametresiz constructor
	public Hayvanlar() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Hayvanlar(long abstractId, String adi, String soyadi) {
		this.abstractId = abstractId;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	// Gövdeli Method
	public void adiMethod() {
		System.out.println(this.adi);
	}

	// Gövdesiz method
	abstract public void adSoyad();

	// toString
	@Override
	public String toString() {
		return "AbstractDersleri [abstractId=" + abstractId + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}

	// getter and setter
	public long getAbstractId() {
		return abstractId;
	}

	public void setAbstractId(long abstractId) {
		this.abstractId = abstractId;
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
