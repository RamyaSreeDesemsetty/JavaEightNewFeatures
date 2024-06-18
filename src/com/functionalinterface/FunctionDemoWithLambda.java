package com.functionalinterface;

import java.util.function.Function;

//class FunctionalExample implements Function<String, Integer> {
//
//	@Override
//	public Integer apply(String t) {
//
//		return t.length();
//	}
//}
public class FunctionDemoWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> func = (String s) -> s.length();

		System.out.println(func.apply("Ramya"));
	}
}
