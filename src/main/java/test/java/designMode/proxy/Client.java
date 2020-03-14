package test.java.designMode.proxy;

import java.lang.reflect.Proxy;

/**
 * @author karl xie
 * Created on 2020-03-13 22:04
 */
public class Client {
    public static void main(String[] args) {

        Landlord landlord = new Landlord();
        Person proxy = (Person) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Person.class},
                new RentHandler(landlord));
        proxy.rent();
    }
}