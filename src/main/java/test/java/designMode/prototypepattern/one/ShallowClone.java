package test.java.designMode.prototypepattern.one;

/**
 * @author karl xie
 * Created on 2020-03-12 21:12
 */
public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();

        a.setA(1);

        B b = new B();

        b.setA(a);

        b.setB(2);


        B b2 = (B)b.clone();

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