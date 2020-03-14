package test.java.nio;
import java.nio.ByteBuffer;
import org.junit.Test;
public class TestNIOBuffer01 {
	 private void doPrint(int pos,int limit,int cap){
		 System.out.println("position:"+pos);
		 System.out.println("limit:"+limit);
		 System.out.println("capacity:"+cap);
	 }
	 @Test
	 public void testBuffer01(){
		 //构建一个缓冲区对象(在JVM内存中分配一块区域)
		 ByteBuffer buf=ByteBuffer.allocate(1024);
		 System.out.println("===数据写入前===");
		 doPrint(buf.position(),buf.limit(),buf.capacity());
         //向缓冲区写入数据
		 byte []data="hello".getBytes();
		 buf.put(data);//放入缓冲区
		 System.out.println("===数据写入后===");
		 doPrint(buf.position(),buf.limit(),buf.capacity());
		 //切换模式(底层同时会移动指针,position位置会发生变换)
		 buf.flip();
		 System.out.println("===读数据之前===");
		 doPrint(buf.position(),buf.limit(),buf.capacity());
		 
		 byte c1=buf.get();
		 System.out.println((char)c1);
		/*
		 * // 创建一个limit()大小的字节数组(因为就只有limit这么多个数据可读) byte[] bytes = new
		 * byte[buf.limit()-1];
		 * 
		 * // 将读取的数据装进我们的字节数组中 buf.get(bytes); String string = new String(bytes, 0,
		 * bytes.length); // 输出数据 System.out.println(string+"-----------------");
		 */
		 System.out.println(new String(buf.array()));
	
		 System.out.println("===读数据之后===");
		 doPrint(buf.position(),buf.limit(),buf.capacity());
		 
		 buf.clear();
		 System.out.println("===clear之后===");
		 doPrint(buf.position(),buf.limit(),buf.capacity());
		 
		 
		 
	 }
}
