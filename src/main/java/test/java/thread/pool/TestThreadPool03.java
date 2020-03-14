package test.java.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*当队列满时，此时便是饱和策略发挥作用的时候了，JDK中定义了四种饱和策略：

1、AbortPolicy：终止策略是默认的饱和策略，当队列满时，会抛出一个RejectExecutionException异常（第一段代码就是例子），客户可以捕获这个异常，根据需求编写自己的处理代码

2、DiscardPolicy：策略会悄悄抛弃该任务。

3、DiscardOldestPolicy：策略将会抛弃下一个将要执行的任务，如果此策略配合优先队列PriorityBlockingQueue，该策略将会抛弃优先级最高的任务

4、CallerRunsPolicy：调用者运行策略，该策略不会抛出异常，不会抛弃任务，
而是将任务回退给调用者线程执行（调用execute方法的线程），由于任务需要执行一段时间，所以在此期间不能提交任务，从而使工作线程有时间执行正在执行的任务。

下面重点演示CallerRunsPolicy策略
*/
public class TestThreadPool03 {
	public static void main(String[] args) {
		// 有界队列
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(10);
		// 调用者运行策略
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 20, 1000, TimeUnit.MILLISECONDS, queue,
				new ThreadPoolExecutor.CallerRunsPolicy());
		for (int i = 0; i < 100; i++) {
			tpe.execute(new Runnable() {
				@Override
				public void run() {

					System.out.println(Thread.currentThread().getName());

				}
			});
		}
		tpe.shutdown();

	}

}
