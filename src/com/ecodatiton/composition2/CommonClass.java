package com.ecodatiton.composition2;

import java.io.Serializable;
import java.util.Date;

//Bean=POJO+constructor+toString+Serializable
public class CommonClass implements Serializable {
	private static final long serialVersionUID = 5235284399362488360L;

	// object field (Nesne değişkenleri)
	private long id;
	private String adi;
	private String soyadi;
	private Date tarih;

	// parametresiz constructor
	public CommonClass() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public CommonClass(long id, String adi, String soyadi) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;

	}

	// toString
	@Override
	public String toString() {
		return "CommonClass [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", tarih=" + tarih + "]";
	}

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

	public Date getTarih() {
		return this.tarih = new Date(System.currentTimeMillis());
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

}
