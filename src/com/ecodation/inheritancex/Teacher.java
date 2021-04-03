package com.ecodation.inheritancex;

public class Teacher extends Person {

	private String languageInformation;
	private String salary;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(long personId, String personName, String personSurname, String personSecurityId,
			String languageInformation, String salary) {
		super(personId, personName, personSurname, personSecurityId);
		this.languageInformation = languageInformation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [languageInformation=" + languageInformation + ", salary=" + salary + ", getPersonId()="
				+ getPersonId() + ", getPersonName()=" + getPersonName() + ", getPersonSurname()=" + getPersonSurname()
				+ ", getPersonSecurityId()=" + getPersonSecurityId() + "]";
	}

	public String getLanguageInformation() {
		return languageInformation;
	}

	public void setLanguageInformation(String languageInformation) {
		this.languageInformation = languageInformation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
