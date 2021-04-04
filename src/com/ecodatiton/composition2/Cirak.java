package com.ecodatiton.composition2;

// N
public class Cirak extends CommonClass {
	private static final long serialVersionUID = 8793096277787526764L;

	private String cirakSertifikasi;

	// composition
	private Usta usta;

	public Cirak() {
		// TODO Auto-generated constructor stub
	}

	public Cirak(long id, String adi, String soyadi, String cirakSertifikasi) {
		super(id, adi, soyadi);
		this.cirakSertifikasi = cirakSertifikasi;
	}

	@Override
	public String toString() {
		return "Cirak [cirakSertifikasi=" + cirakSertifikasi + ", getId()=" + getId() + ", getAdi()=" + getAdi()
				+ ", getSoyadi()=" + getSoyadi() + ", getTarih()=" + getTarih() + "]";
	}

	// getter and setter
	public String getCirakSertifikasi() {
		return cirakSertifikasi;
	}

	public void setCirakSertifikasi(String cirakSertifikasi) {
		this.cirakSertifikasi = cirakSertifikasi;
	}

	public Usta getUsta() {
		return usta;
	}

	public void setUsta(Usta usta) {
		this.usta = usta;
	}

}
