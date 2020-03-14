package test.java.designMode.proxy;

/**
 * @author karl xie
 * Created on 2020-03-13 22:02
 */
public class Landlord implements Person {
    @Override
    public void rent() {
        System.out.println("来我家租房子");
    }
}