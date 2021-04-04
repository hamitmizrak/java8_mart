package com.ecodatiton.composition;

import java.io.Serializable;
import java.util.List;

//Ogretmen bean class (1)
public class Ogretmen implements Serializable {
	private static final long serialVersionUID = 3247727065335338984L;

	// nesne değişkenleri
	private long ogretmenId;
	private String ogretmenAdi;
	private String ogretmenSoyadi;
	private String ogretmenAdresi;

	// composititon
	private java.util.List<Ogrenciler> ogrencilerList;

	// parametresiz constructor
	public Ogretmen() {

	}

	// parametreli constructor
	public Ogretmen(long ogretmenId, String ogretmenAdi, String ogretmenSoyadi, String ogretmenAdresi) {
		this.ogretmenId = ogretmenId;
		this.ogretmenAdi = ogretmenAdi;
		this.ogretmenSoyadi = ogretmenSoyadi;
		this.ogretmenAdresi = ogretmenAdresi;
	}

	// toString
	@Override
	public String toString() {
		return "Ogretmen [ogretmenId=" + ogretmenId + ", ogretmenAdi=" + ogretmenAdi + ", ogretmenSoyadi="
				+ ogretmenSoyadi + ", ogretmenAdresi=" + ogretmenAdresi + "]";
	}

	// getter and setter
	public long getOgretmenId() {
		return ogretmenId;
	}

	public void setOgretmenId(long ogretmenId) {
		this.ogretmenId = ogretmenId;
	}

	public String getOgretmenAdi() {
		return ogretmenAdi;
	}

	public void setOgretmenAdi(String ogretmenAdi) {
		this.ogretmenAdi = ogretmenAdi;
	}

	public String getOgretmenSoyadi() {
		return ogretmenSoyadi;
	}

	public void setOgretmenSoyadi(String ogretmenSoyadi) {
		this.ogretmenSoyadi = ogretmenSoyadi;
	}

	public String getOgretmenAdresi() {
		return ogretmenAdresi;
	}

	public void setOgretmenAdresi(String ogretmenAdresi) {
		this.ogretmenAdresi = ogretmenAdresi;
	}

	public List<Ogrenciler> getOgrencilerList() {
		return ogrencilerList;
	}

	public void setOgrencilerList(List<Ogrenciler> ogrencilerList) {
		this.ogrencilerList = ogrencilerList;
	}

}
