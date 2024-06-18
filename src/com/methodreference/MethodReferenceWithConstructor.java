package com.methodreference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceWithConstructor {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Mango");

//		Function<List<String>, Set<String>> setFun = (fruitList) -> new HashSet<>(fruitList);
//		System.out.println(setFun.apply(fruits));
//
		Function<List<String>, Set<String>> setFunc = HashSet::new;
		System.out.println(setFunc.apply(fruits));

//		Set<String> fruit = new HashSet<>();
//		fruit.add("banana");
//		fruit.add("Apple");
//		fruit.add("Mango");
//		fruit.add("Mango");

		Function<Set<String>, List<String>> listFun = (fruitNew) -> new ArrayList<>(fruitNew);
		System.out.println(listFun.apply((Set<String>) setFunc));
//		Function<Set<String>, List<String>> listFun = (s) -> new ArrayList<>(s);
//		System.out.println(listFun.apply(fruit));

	}

}
