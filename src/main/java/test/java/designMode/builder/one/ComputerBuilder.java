package test.java.designMode.builder.one;

/**
 * @author karl xie
 * Created on 2020-03-12 20:48
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    abstract void buildCPU();

    abstract void buildMainboard();

    abstract void buildHD();

    abstract Computer build();
}