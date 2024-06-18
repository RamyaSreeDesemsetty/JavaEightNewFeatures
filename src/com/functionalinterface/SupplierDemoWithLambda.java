package com.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemoWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> supp = () -> LocalDateTime.now();
		System.out.println(supp.get());
	}

}
