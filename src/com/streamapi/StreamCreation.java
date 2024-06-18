package com.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("ab", "cd", "ef");
		s1.forEach(System.out::println);
		Collection<String> s2 = Arrays.asList("rmj", "njg", "bhk");
		Stream<String> s3 = s2.stream();
		s3.forEach(System.out::println);
		
		List<String> list = Arrays.asList("rmj", "njg", "bhk");
		Stream<String> list1 = list.stream();
		list1.forEach(System.out::println);
		
		Set<String> setlist = new HashSet<String>(list);
		Stream<String> slist = setlist.stream();
		slist.forEach(System.out::println);

		String[] str = { "yu", "oi", "hj", "kl" };
		Stream<String> s = Arrays.stream(str);
		s.forEach(System.out::println);

	}

}
