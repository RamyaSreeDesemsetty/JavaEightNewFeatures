package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ramya");
		map.put(2, "Sree");
		map.put(3, "RS");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
		}

		Set<Map.Entry<Integer, String>> ent = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = ent.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> c = it.next();
			System.out.println(c.getValue());
		}

		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});

	}

}
