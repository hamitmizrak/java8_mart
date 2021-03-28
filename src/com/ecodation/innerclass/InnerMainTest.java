package com.ecodation.innerclass;

public class InnerMainTest {

	public static void main(String[] args) {
		UlkeClass ulkeClass = new UlkeClass();
		ulkeClass.setUlkeId("0012");
		ulkeClass.setUlkeAdi("Türkiye");
		ulkeClass.setUlkeKodu("+9");

		UlkeClass.SehirClass sehirClass = ulkeClass.new SehirClass();
		sehirClass.setSehirId("65d");
		sehirClass.setSehirAdi("İstanbul");
		sehirClass.setSehirKodu("34");

		UlkeClass.SehirClass.mahalleClass mahalleClass = sehirClass.new mahalleClass();
		mahalleClass.setMahalleId(451);
		mahalleClass.setMahalleAdi("Kırlangıç");
		mahalleClass.setMahalleKodu("51hn");

	}
}
