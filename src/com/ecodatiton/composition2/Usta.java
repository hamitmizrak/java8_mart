package com.ecodatiton.composition2;

import java.util.List;

// 1 
public class Usta extends CommonClass {
	private static final long serialVersionUID = -1267662998355407082L;

	private String ustaSertifikasi;

	// composition
	private List<Cirak> cirakList;

	public Usta() {
		// TODO Auto-generated constructor stub
	}

	public Usta(long id, String adi, String soyadi, String ustaSertifikasi) {
		super(id, adi, soyadi);
		this.ustaSertifikasi = ustaSertifikasi;
	}

	@Override
	public String toString() {
		return "Usta [ustaSertifikasi=" + ustaSertifikasi + ", getId()=" + getId() + ", getAdi()=" + getAdi()
				+ ", getSoyadi()=" + getSoyadi() + ", getTarih()=" + getTarih() + "]";
	}

	// getter and setter
	public String getUstaSertifikasi() {
		return ustaSertifikasi;
	}

	public void setUstaSertifikasi(String ustaSertifikasi) {
		this.ustaSertifikasi = ustaSertifikasi;
	}

	public List<Cirak> getCirakList() {
		return cirakList;
	}

	public void setCirakList(List<Cirak> cirakList) {
		this.cirakList = cirakList;
	}

}
