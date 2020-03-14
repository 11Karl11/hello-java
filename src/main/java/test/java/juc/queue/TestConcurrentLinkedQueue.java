package test.java.juc.queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class TestConcurrentLinkedQueue {
	
	public static void main(String[] args) {
		ConcurrentLinkedDeque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
		concurrentLinkedDeque.add("a");
		concurrentLinkedDeque.add("b");//add和offer方法一样的
		concurrentLinkedDeque.offer("c");
		concurrentLinkedDeque.offer("d");
		System.out.println(concurrentLinkedDeque);
		String peek = concurrentLinkedDeque.peek();
		System.out.println(peek);
		String poll = concurrentLinkedDeque.poll();//poll会移除头元素
		System.out.println(poll);
		System.out.println(concurrentLinkedDeque);
		for (String s : concurrentLinkedDeque) {
			System.out.println(s);
		}
	
	}
}
