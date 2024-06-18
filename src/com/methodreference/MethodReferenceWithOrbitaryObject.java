package com.methodreference;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReferenceWithOrbitaryObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> func = (input) -> input.toLowerCase();
		System.out.println(func.apply("Ramya"));

		Function<String, String> funcs = String::toLowerCase;
		System.out.println(funcs.apply("Ramya"));

		String[] strArr = { "A", "E", "J", "C" };
		Arrays.sort(strArr, (a, b) -> a.compareToIgnoreCase(b));
		Arrays.sort(strArr, String::compareToIgnoreCase);
	}

}
