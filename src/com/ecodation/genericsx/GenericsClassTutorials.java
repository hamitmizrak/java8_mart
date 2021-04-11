package com.ecodation.genericsx;

public class GenericsClassTutorials<T> {

	private T name;
	private String surname;

	public GenericsClassTutorials() {
		// TODO Auto-generated constructor stub
	}

	public GenericsClassTutorials(T name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	// Generics Methods
	public <G> void deneme(G adres, String postaKodu) {

		System.out.println("Adresiniz: " + adres + " posta kodu: " + postaKodu);
	}

	@Override
	public String toString() {
		return "GenericsClassTutorials [name=" + name + ", surname=" + surname + "]";
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
