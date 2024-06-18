package com.functionalinterface;

public class RunnableFunctionalInterface {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Running");
		Thread td = new Thread(runnable);
		td.start();
		// to as constructor parameter
		Thread tdh = new Thread(() -> System.out.println("Running"));
		tdh.start();

	}

}
