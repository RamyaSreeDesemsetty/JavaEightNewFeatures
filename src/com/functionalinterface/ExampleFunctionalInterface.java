package com.functionalinterface;

@FunctionalInterface
interface FunctionalInterfaceExample {
	void fun(String msg);

	default void method1() {
		System.out.println("default method");
	}

	static void method2() {
		System.out.println("static method");
	}
}
public class ExampleFunctionalInterface {

}
