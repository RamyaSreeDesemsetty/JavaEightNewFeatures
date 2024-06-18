package com.functionalinterface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> con = new ConsumerImpl();
		con.accept("Ramya");
	}

}
