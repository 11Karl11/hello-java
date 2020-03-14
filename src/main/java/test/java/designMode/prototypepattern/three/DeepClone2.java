package test.java.designMode.prototypepattern.three;

import java.io.*;

/**
 * @author karl xie
 * Created on 2020-03-12 21:29
 */
public class DeepClone2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A();
        a.setA(1);
        B b = new B();
        b.setA(a);
        b.setB(2);
        //使用序列化和反序列化实现深克隆
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(b);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        B b2 = (B) ois.readObject();
        System.out.println("b-->" + b);
        System.out.println("b2-->" + b2);
        b2.setB(3);
        System.out.println("b-->" + b);
        System.out.println("b2-->" + b2);
        b2.getA().setA(10);
        System.out.println("b-->" + b);
        System.out.println("b2-->" + b2);
    }
}