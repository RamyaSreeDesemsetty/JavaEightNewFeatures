package com.strings;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();
		str.add("Ramya");
		str.add("23456");

		String result = str.stream().reduce("", (ans, i) -> i.concat(ans));
		System.out.println(result);
		String str1 = "Ramya";
		String str2 = "12-06-2000";
//		if (str1.length() != 3) {
//			System.out.println(str1.substring(0, 4));
//		} else {
//			System.out.println(str1);
//		}
//		String[] result1 = str1.split("-");
//		System.out.println((Arrays.toString(result1)));
		String[] strNew = str2.split("-");
		String str4 = String.join("", strNew);
		System.out.println(str4);
		if ((str1.length() != 3) && str4.length() == 8) {
			System.out.println(str1.substring(0, 4) + "" + str4.substring(0, 4));
		}

	}

}
