package com.ecodation.inheritancex;

import java.io.Serializable;

//aynı ortak  özellikler

public class Person implements Serializable {
	private static final long serialVersionUID = 6745941436540566444L;

	private long personId;
	private String personName;
	private String personSurname;
	private String personSecurityId;

	public Person() {
		this.personSecurityId = "0";
	}

	public Person(long personId, String personName, String personSurname, String personSecurityId) {
		this.personId = personId;
		this.personName = personName;
		this.personSurname = personSurname;
		this.personSecurityId = personSecurityId;
	}

	// toString
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personSurname=" + personSurname
				+ ", personSecurityId=" + personSecurityId + "]";
	}

	// getter and setter
	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSurname() {
		return personSurname;
	}

	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}

	public String getPersonSecurityId() {
		return personSecurityId;
	}

	public void setPersonSecurityId(String personSecurityId) {
		this.personSecurityId = personSecurityId;
	}

}
