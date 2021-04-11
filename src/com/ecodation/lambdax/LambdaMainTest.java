package com.ecodation.lambdax;

public class LambdaMainTest {
	public static void main(String[] args) {

		// Lambdasız gösterim şekli
		LambdaVoid lambdaVoid = new LambdaVoid() {
			@Override
			public void deneme() {
				System.out.println("Merhabalar Lambdasız dünya");
			}
		};
		lambdaVoid.deneme();
		/////////////////////////////////////////////////////////////////////////////////

		LambdaVoid lambdaVoid2 = () -> {
			System.out.println("Merhabalar Lambdalı dünya");
		};
		lambdaVoid2.deneme();

	}
}
