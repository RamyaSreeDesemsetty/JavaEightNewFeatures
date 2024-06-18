package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMapDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		Optional<Integer> element = list.stream().findFirst();
		if (element.isPresent()) {
			System.out.println(element.get());

		} else {
			System.out.println("Nothing");
		}

		Optional<Integer> elements = list.stream().findAny();
		if (elements.isPresent()) {
			System.out.println(elements.get());

		} else {
			System.out.println("Nothing");
		}

		Optional<Integer> i=list.stream().min(Comparator.comparing(Integer::valueOf));
		if(i.isPresent()) {
		System.out.println(i.get());
	}

}
}
