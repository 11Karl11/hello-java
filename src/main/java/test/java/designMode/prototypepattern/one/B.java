package test.java.designMode.prototypepattern.one;

import lombok.Data;

/**
 * @author karl xie
 * Created on 2020-03-12 21:12
 */
@Data
public class B implements Cloneable{
    private int b;
    private A a;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
