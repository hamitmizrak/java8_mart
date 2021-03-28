package com.ecodation.string;

import java.util.StringTokenizer;

public class StringTokenizerTuto {
	public static void main(String[] args) {
		String kelime = "Java se Hibernate JavaEE" + " EJB Servlet JSP JSF"
				+ " Springboot Springdata Springmvc Jax-RS jax-ws Mysql Mssql";

		StringTokenizer tokenizer = new StringTokenizer(kelime, " ");

		while (tokenizer.hasMoreTokens()) {
			String parcala = tokenizer.nextToken();
			System.out.println(parcala);
		}

		System.out.println("---------------");
		String[] parcala2 = kelime.split(" ");
		for (String temp : parcala2) {
			System.out.println(temp + " ");
		}
	}
}
