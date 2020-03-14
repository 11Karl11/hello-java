package test.java.designMode.builder.one;

/**
 * @author karl xie
 * Created on 2020-03-12 21:04
 */
public class Director {
    private ComputerBuilder builder;
    public Director(ComputerBuilder builder){
        this.builder = builder;
    }
    public Computer construct(){
        builder.buildCPU();
        builder.buildHD();
        builder.buildMainboard();
        return builder.build();
    }
}