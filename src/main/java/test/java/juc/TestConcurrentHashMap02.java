package test.java.juc;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap02 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("1", "a");
		map.put("2", "c");

		map.put("3", "d");

		//遍历方式1
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry);

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

			}
		//遍历方式2
		for(String key : map.keySet()) {

			System.out.println("key = " + key);

			}
		for(String value : map.values()) {

			System.out.println("value = " + value);

			}
		//遍历方式3
		//方法三：使用Iterator遍历,使用并发集合不会报异常,性能类似于方法二

		//使用泛型

		Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();

		System.out.println("使用Iterator遍历,并且使用泛型:");

		while (entries.hasNext()) {

		Map.Entry<String, String> entry = entries.next();

		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		//注意这里操作了集合,下面的的遍历不会再打印0

		if("0".equals(entry.getKey())) {

		map.remove(entry.getKey());

		}
		//不使用泛型

		Iterator entrys = map.entrySet().iterator();

		System.out.println("使用Iterator遍历,并且不使用泛型");

		while (entrys.hasNext()) {

		Map.Entry entry1 = (Map.Entry) entrys.next();

		String key = (String)entry1.getKey();

		String value = (String)entry1.getValue();

		System.out.println("Key = " + key + ", Value = " + value);

		}

		}
	}
}
