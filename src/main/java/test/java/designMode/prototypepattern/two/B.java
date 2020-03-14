package test.java.designMode.prototypepattern.two;

import lombok.Data;

/**
 * @author karl xie
 * Created on 2020-03-12 21:26
 */
@Data
public class B implements Cloneable {
    private Integer b;
    private A a;

    @Override
    public Object clone() throws CloneNotSupportedException {
        //深克隆的关键在于将对象clone后，将对象中的引用类型(除了String)也clone一份赋值给新对象。
        B b = (B) super.clone();
        A a = b.getA();
        b.setA((A) a.clone());
        return b;
    }
}