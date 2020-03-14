package test.java.designMode.builder.two;

/**
 * @author karl xie
 * Created on 2020-03-12 20:48
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    abstract ComputerBuilder buildCPU();

    abstract ComputerBuilder buildMainboard();

    abstract ComputerBuilder buildHD();

    abstract Computer build();
}