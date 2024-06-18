package com.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String email = "Ramya@gmail.com";
		// staticMethod
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		// staticMethod
		Optional<String> op = Optional.of(email);
		System.out.println(op);
		// staticMethod
		Optional<String> opt = Optional.ofNullable(email);
		System.out.println(opt);// along with class the value will return
		System.out.println(opt.get() + " -using get");// only value it returns
		// method
		if (opt.isPresent()) {
			System.out.println(opt.get() + " -using get with ispresent()");
		} else {
			System.out.println("No value");
		}
		// method-orelse
		Optional<String> optional = Optional.ofNullable(email);
		System.out.println(optional.orElse("default value"));
		//method-orelseget
		Optional<String> optional2 = Optional.ofNullable(email);
		System.out.println(optional2.orElseGet(() -> "default"));
		
		Optional<String> optional3 = Optional.ofNullable(email);
		System.out.println(optional2.orElseThrow(() -> new IllegalArgumentException("email not present")));

		Optional<String> gender = Optional.of("Ramya");
		gender.ifPresent((s) -> System.out.println("value is present"));

		Optional<String> emptyOp = Optional.empty();
		emptyOp.ifPresent((s) -> System.out.println("No value is present"));

		// filter without
		String result = " abc ";
		if (result != null && result.contains("abc")) {
			System.out.println(result);
		}
		// filter
		Optional<String> opstr = Optional.of("abc");
		opstr.filter(res -> res.contains("abc")).ifPresent((res) -> System.out.println(res));

	//map
	Optional<String> optstr = Optional.of(" xyz ");
	optstr.map(res -> res.trim()).ifPresent((res) -> System.out.println(res));
	optstr.map(String::trim).ifPresent((res) -> System.out.println(res));// with methodreference
}
}
