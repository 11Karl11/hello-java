package test.java.designMode.prototypepattern.two;

import lombok.Data;

/**
 * @author karl xie
 * Created on 2020-03-12 21:25
 */
@Data
public class A implements Cloneable {

    private int a;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}