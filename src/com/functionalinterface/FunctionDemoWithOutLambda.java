package com.functionalinterface;

import java.util.function.Function;

class FunctionExample implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {

		return t.length();
	}

}
public class FunctionDemoWithOutLambda {

	public static void main(String[] args) {
		Function<String, Integer> fun = new FunctionExample();
		System.out.println(fun.apply("Ramya"));
	}

}
