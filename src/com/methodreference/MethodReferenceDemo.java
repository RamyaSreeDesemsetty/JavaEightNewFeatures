package com.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {

	public static int add(int a, int b) {
		return (a + b);
	}
	public static void main(String[] args) {
		// Static method
		// lambdaexpression
		Function<Integer, Double> fun = (s) -> Math.sqrt(s);
		System.out.println(fun.apply(4));
		// methodreference
		Function<Integer, Double> func = Math::sqrt;
		System.out.println(func.apply(5));
//2nd example
		BiFunction<Integer, Integer, Integer> bifun = (a, b) -> MethodReferenceDemo.add(a, b);
		System.out.println(bifun.apply(3, 6));
		// methodreference
		BiFunction<Integer, Integer, Integer> bifunc = MethodReferenceDemo::add;
		System.out.println(bifunc.apply(3, 7));
	}

}
