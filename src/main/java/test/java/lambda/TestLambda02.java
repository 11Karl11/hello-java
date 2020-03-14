package test.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.tools.ant.taskdefs.optional.ccm.Continuus;

public class TestLambda02 {
	public static void main(String[] args) {
		new Thread(()-> System.out.println("hell word")).start();
		Runnable r1=()->{
		     System.out.println(Thread.currentThread().getName());
		 };
		new Thread(r1).start();
		List <String> list = Arrays.asList(new String[]{"test","demo"});
        list.forEach(x->{
            System.out.println(x);
 
        });
		/*
		 * for(int i=0;i<100;i++) {
		 * 
		 * System.out.println(i); break;
		 * 
		 * } for (String string : list) { System.out.println(string); break; }
		 */

}
/*	public static void action(String[] args) {
		new Thread(()-> System.out.println("hell word")).start();
		List <String> list = Arrays.asList(new String[]{"test","demo"});
        list.forEach(x->{
            System.out.println(x);
 
        });
        for(int i=0;i<100;i++) {
        	
        	System.out.println(i);
        	break;
        	
        }
        for (String string : list) {
			System.out.println(string);
			break;
		}*/


}
