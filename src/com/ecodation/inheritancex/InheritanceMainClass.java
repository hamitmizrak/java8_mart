package com.ecodation.inheritancex;

public class InheritanceMainClass {

	public static void main(String[] args) {
		Teacher teacher = new Teacher(100, "Farid", "Farjat", "5252452", "English", "25");
		System.out.println(teacher);

		Student student = new Student();
		student.setPersonId(200);
		student.setPersonName("Hamit");
		student.setPersonSurname("Mızrak");
		// @Overrride
		student.setPersonSecurityId("8552655");
		System.out.println(student);
	}
}
