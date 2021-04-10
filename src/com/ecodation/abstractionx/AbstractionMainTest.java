package com.ecodation.abstractionx;

public class AbstractionMainTest {

	public static void main(String[] args) {
		// Person person = new Person();
		Erkek erkek1 = new Erkek(100, "Erkek-1 adı", "Erkek soyadı-1");
		System.out.println(erkek1.fullName());
		System.out.println(erkek1);
		erkek1.guc();
		erkek1.boy();
		erkek1.calisma();
		erkek1.kupa();

		System.out.println("---------------------------------------------------------------");

		Erkek erkek2 = new Erkek(200, "Erkek-2 adı", "Erkek soyadı-2");
		System.out.println(erkek2.fullName());
		System.out.println(erkek2);
		erkek2.guc();
		erkek2.boy();
		erkek2.calisma();
		erkek2.kupa();

		System.out.println("---------------------------------------------------------------");

		Bayan bayan1 = new Bayan(100, "Bayan-1 adı", "Bayan-1 soyadı");
		System.out.println(bayan1.fullName());
		System.out.println(bayan1);
		bayan1.guzellikler();
		bayan1.duzenli();
		bayan1.temizlik();
		bayan1.cicek();

		System.out.println("---------------------------------------------------------------");

		Bayan bayan2 = new Bayan(200, "Bayan-2 adı", "Bayan-2 soyadı");
		System.out.println(bayan2.fullName());
		System.out.println(bayan2);
		bayan2.guzellikler();
		bayan2.duzenli();
		bayan2.temizlik();
		bayan2.cicek();

	}

}
