package com.deep.java.collections.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>(); //failsafe
		//Map<String, String> map = new HashMap<String, String>(); //failfast
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");

		Iterator<String> iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			map.put("key4", "value4");
		}

	}

}