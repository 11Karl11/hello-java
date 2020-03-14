package test.java.juc.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*增加值的方法：

add(): 在不超出队列长度的情况下插入元素，可以立即执行，成功返回true，如果队列满了就抛出异常,其底层实现的是offer方法，不会阻塞。
offer(): 在不超出队列长度的情况下插入元素的时候则可以立即在队列的尾部插入指定元素,成功时返回true，如果此队列已满，则返回false。不会阻塞。

put()： 插入元素的时候，如果队列满了就进行等待，直到队列可用。

取值的方法：

 remove():底层是用到了poll()方法，检索并且删除返回队列头的元素,与poll()方法不同的是，元素没有是进行抛异常NoSuchElementException。

poll(): 检索并且删除返回队列头的元素,有就返回没有就返回null。

take(): 检索并且删除返回队列头的元素,如果元素没有会一直等待，有就返回。

peek(): 检索但不移除此队列的头部;如果此队列为空，则返回null。返回头部元素。     
*/
//队列阻塞之后会一直等待
public class TestBlockingQueue01 {

	public static void main(String[] args) throws Exception {
		BlockingQueue<String> bQueue =
				// 数组+有界+阻塞
				new ArrayBlockingQueue<>(3);// FIFO
		bQueue.put("A");
		bQueue.put("B");
		bQueue.put("C");
		System.out.println(bQueue);
		/*
		 * System.out.println(bQueue); bQueue.put("D");//被阻塞
		 */ 
		boolean offer = bQueue.offer("d");
		System.out.println(offer);
		//bQueue.put("1");
		System.out.println(bQueue);
		String s1 = bQueue.take();
		System.out.println(s1);
		System.out.println(bQueue);
		String s2 = bQueue.take();
		System.out.println(s2);
		String s3 = bQueue.take();
		System.out.println(s3);// C
		

	}
}
