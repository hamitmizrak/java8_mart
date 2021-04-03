package com.ecodation.inheritancex;

public class Student extends Person {

	private String studentNotes;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long personId, String personName, String personSurname, String personSecurityId,
			String studentNotes) {
		super(personId, personName, personSurname, personSecurityId);
		this.studentNotes = studentNotes;
	}

	// getter and setter
	public String getStudentNotes() {
		return studentNotes;
	}

	public void setStudentNotes(String studentNotes) {
		this.studentNotes = studentNotes;
	}

	@Override
	public String toString() {
		return "Student [studentNotes=" + studentNotes + ", getPersonId()=" + getPersonId() + ", getPersonName()="
				+ getPersonName() + ", getPersonSurname()=" + getPersonSurname() + ", getPersonSecurityId()="
				+ getPersonSecurityId() + "]";
	}

}
