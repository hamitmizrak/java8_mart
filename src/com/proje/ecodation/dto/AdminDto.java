package com.proje.ecodation.dto;

import java.io.Serializable;

public class AdminDto implements Serializable {
	private static final long serialVersionUID = -4692225830209987934L;

	private long adminId;
	private String adi;
	private String soyadi;
	private String email;
	private String sifre;

	public AdminDto() {
		// TODO Auto-generated constructor stub
	}

	public AdminDto(String adi, String soyadi, String email, String sifre) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
		this.sifre = sifre;
	}

	public AdminDto(long adminId, String adi, String soyadi, String email, String sifre) {
		this.adminId = adminId;
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adi=" + adi + ", soyadi=" + soyadi + ", email=" + email + ", sifre="
				+ sifre + "]";
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

}
