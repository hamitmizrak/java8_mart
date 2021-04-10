package com.ecodation.abstractionx;

import java.io.Serializable;

public abstract class Person implements Serializable {
	private static final long serialVersionUID = -4226776670037676340L;

	// Tüm insanlardaki ortak özellikler
	private long personId;
	private String name;
	private String surname;

	// parametresiz constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Person(long personId, String name, String surname) {
		this.personId = personId;
		this.name = name;
		this.surname = surname;
	}

	// toString
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", surname=" + surname + "]";
	}

	// gövdeli metot
	public String fullName() {
		return this.name + " " + this.surname;
	}

	// gövdesiz method
	abstract public String idFullName(long id, String name, String surname);

	// getter and setter
	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
