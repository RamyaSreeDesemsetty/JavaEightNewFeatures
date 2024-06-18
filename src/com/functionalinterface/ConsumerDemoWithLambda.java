package com.functionalinterface;

import java.util.function.Consumer;

public class ConsumerDemoWithLambda {

	public static void main(String[] args) {
		Consumer<String> conc = (s) -> System.out.println(s);
		conc.accept("RamyaSree");

	}

}
