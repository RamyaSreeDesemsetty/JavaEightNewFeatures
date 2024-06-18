package com.lambdaexpressions;

interface Addable {
	int addition(int a, int b);

}

class Addtion implements Addable {

	@Override
	public int addition(int a, int b) {

		return (a + b);
	}

}
public class LambdaExpressionWithParameters {

	public static void main(String[] args) {
//1st method
//		Addable add = (a, b) -> {
//			return (a + b);
//		};
		Addable add= (a,b)->{
			int c =a+b;
			return c;
		};
		System.out.println(add.addition(5, 4));
		Addable add1 = (a, b) -> (a + b);
		System.out.println(add.addition(3, 6));

	}

}
