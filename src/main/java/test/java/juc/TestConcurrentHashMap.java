package test.java.juc;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class TestConcurrentHashMap {
	public static void main(String[] args) {

		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		/*
		 * boolean empty = concurrentHashMap.isEmpty(); System.out.println(empty);
		 * Object object = concurrentHashMap.get("1"); System.out.println(object);
		 * boolean containsKey = concurrentHashMap.containsKey("1");
		 * System.out.println(containsKey); boolean contains =
		 * concurrentHashMap.contains("11"); System.out.println(contains);
		 * 
		 * Object put = concurrentHashMap.put("1", "ok"); System.out.println(put);
		 * Object put2 = concurrentHashMap.put("1", "true11"); System.out.println(put2);
		 * String v=(String) concurrentHashMap.get("1"); System.out.println(v); Object
		 * putIfAbsent = concurrentHashMap.putIfAbsent("1", "exchange");
		 * System.out.println(putIfAbsent); String
		 * v1=(String)concurrentHashMap.get("1"); System.out.println(v1);
		 * 
		 * Object remove = concurrentHashMap.remove("1"); System.out.println(remove);
		 * 
		 * boolean remove = concurrentHashMap.remove("1", "t");
		 * System.out.println(remove); boolean replace = concurrentHashMap.replace("1",
		 * "true11", "ok11"); System.out.println(replace);
		 * System.out.println(concurrentHashMap.get("1")); concurrentHashMap.clear();
		 * System.out.println(concurrentHashMap.isEmpty());
		 */
		concurrentHashMap.put("1", "ok");
		concurrentHashMap.put("2", "ok2");
		concurrentHashMap.put("my", "ok3");
		KeySetView<String,String> keySet = concurrentHashMap.keySet();
		System.out.println(keySet);
		boolean remove = keySet.remove("my");
		System.out.println(keySet);
		Object object = concurrentHashMap.get("my");
		System.out.println(object);
		Collection<String> values = concurrentHashMap.values();
		System.out.println(values);
		Set<Entry<String,String>> entrySet = concurrentHashMap.entrySet();
		System.out.println(entrySet);
		Enumeration<String> keys = concurrentHashMap.keys();
		Enumeration<String> elements = concurrentHashMap.elements();
		System.out.println(keys);
		while(keys.hasMoreElements()) {
			Object nextElement = keys.nextElement();
			System.out.println(nextElement);
		}
	while(elements.hasMoreElements()) {
		System.out.println(elements.nextElement());
	}
		
	
		
	}

}
