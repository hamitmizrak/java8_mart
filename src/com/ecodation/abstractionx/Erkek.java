package com.ecodation.abstractionx;

import java.io.Serializable;

public class Erkek extends Person implements IErkekFarkliOrtakOzellikler, IErkekKupaBardak, Serializable {
	private static final long serialVersionUID = -3576782812531315388L;

	public Erkek() {

	}

	public Erkek(long personId, String name, String surname) {
		super(personId, name, surname);
	}

	@Override
	public String idFullName(long id, String name, String surname) {
		return id + " " + name + " " + surname;
	}

	@Override
	public void guc() {
		System.out.println("güçlü");

	}

	@Override
	public double boy() {

		return 183;
	}

	@Override
	public void calisma() {
		System.out.println("daha fazla çalışma");

	}

	@Override
	public void kupa() {
		System.out.println("Turuncu ");

	}

}
