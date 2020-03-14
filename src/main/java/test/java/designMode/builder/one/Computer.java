package test.java.designMode.builder.one;

import lombok.Data;

/**
 * @author karl xie
 * Created on 2020-03-12 20:48
 */
@Data
public class Computer {
    private String CPU;
    private String HD;
    private String Mainboard;

    public void show(){
        System.out.println(this.CPU + ":" + this.HD + ":" + Mainboard);
    }
}