package test.java.designMode.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author karl xie
 * Created on 2020-03-13 22:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentHandler implements InvocationHandler {


    Person landlord;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置处理
        System.out.println("经过调研,杭州的房子不错");
        method.invoke(landlord,args);
        //后置处理
        System.out.println("房子漏水,联系人维修");
        return null;
    }
}