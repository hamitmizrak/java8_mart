package com.ecodation.lambdax;

public class VoidParametreliLambdaMainTest {
	public static void main(String[] args) {

		LambdaVoidliParametreli voidliParametreli = (int k, int l) -> {
			System.out.println((k + l));
		};

		voidliParametreli.deneme2(4, 6);

	}
}
