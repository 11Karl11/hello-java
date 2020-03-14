package test.java.designMode.prototypepattern.three;

import lombok.Data;

import java.io.Serializable;

/**
 * @author karl xie
 * Created on 2020-03-12 21:29
 */
@Data
public class B implements Serializable {
    private Integer b;
    private A a;

}