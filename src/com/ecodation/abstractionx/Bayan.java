package com.ecodation.abstractionx;

import java.io.Serializable;

public class Bayan extends Person implements IBayanFarkliOrtakOzellikler, IBayanCicek, Serializable {
	private static final long serialVersionUID = -8430329248310591865L;

	public Bayan() {
		// TODO Auto-generated constructor stub
	}

	public Bayan(long personId, String name, String surname) {
		super(personId, name, surname);
	}

	@Override
	public String idFullName(long id, String name, String surname) {
		return id + " " + name + " " + surname;
	}

	@Override
	public void guzellikler() {
		System.out.println("Daha güzeldir");

	}

	@Override
	public void duzenli() {
		System.out.println("daha düzenli");

	}

	@Override
	public void temizlik() {
		System.out.println("daha temiz");

	}

	@Override
	public void cicek() {
		System.out.println("Buket çiçek");

	}

}
