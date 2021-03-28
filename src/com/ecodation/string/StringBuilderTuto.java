package com.ecodation.string;

public class StringBuilderTuto {

	public static void main(String[] args) {

		// artı operant
		System.out.println("Hamit" + " Mizrak" + " java");

		// concat
		System.out.println("Hamit".concat(" Mizrak").concat(" java"));

		// StringBuilder
		String str = "databasesten gelen veriler ";
		StringBuilder builder = new StringBuilder(str);
		builder.append("  ").append(" 1.eklendi ").append(" 2.eklendi ").append(" sona eklendi").append(" ");
		String cevir = builder.toString();
		System.out.println(cevir);

		// StringBuffer
		// daha güvenli ancak StringBuilder'a göre yavaştır
		StringBuffer buffer = new StringBuffer(str);
		buffer.append("  ").append(" 1.eklendi ").append(" 2.eklendi ").append(" sona eklendi").append(" ");
		String cevir2 = buffer.toString();
		System.out.println(cevir2);

	}
}
