package test.java.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
//设置策略的第二种方式
public class TestThreadPool04 {
	public static void main(String[] args) {
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(10);
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 5, 60, TimeUnit.SECONDS, queue);
		threadPool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
		for (int i = 0; i < 100; i++) {
			threadPool.execute(new Runnable() {
				@Override
				public void run() {

					System.out.println(Thread.currentThread().getName());

				}
			});
		}
		threadPool.shutdown();


}
}
