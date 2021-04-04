package com.ecodatiton.composition;

import java.io.Serializable;

//Ogrenci bean class (N)
public class Ogrenciler implements Serializable {
	private static final long serialVersionUID = 7728416527326079876L;

	// nesne değişkenleri
	private long ogrenciId;
	private String ogrenciAdi;
	private String ogrenciSoyadi;
	private String ogrenciAdresi;

	// composititon
	private Ogretmen ogretmen;

	// parametresiz constructor
	public Ogrenciler() {

	}

	// parametreli constructor
	public Ogrenciler(long ogrenciId, String ogrenciAdi, String ogrenciSoyadi, String ogrenciAdresi) {
		this.ogrenciId = ogrenciId;
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciSoyadi = ogrenciSoyadi;
		this.ogrenciAdresi = ogrenciAdresi;
	}

	// toString
	@Override
	public String toString() {
		return "Ogrenciler [ogrenciId=" + ogrenciId + ", ogrenciAdi=" + ogrenciAdi + ", ogrenciSoyadi=" + ogrenciSoyadi
				+ ", ogrenciAdresi=" + ogrenciAdresi + "]";
	}

	// getter and setter
	public long getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(long ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}

	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	public String getOgrenciAdresi() {
		return ogrenciAdresi;
	}

	public void setOgrenciAdresi(String ogrenciAdresi) {
		this.ogrenciAdresi = ogrenciAdresi;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

}
