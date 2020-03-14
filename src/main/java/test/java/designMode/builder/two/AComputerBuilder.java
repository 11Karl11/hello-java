package test.java.designMode.builder.two;

/**
 * @author karl xie
 * Created on 2020-03-12 20:49
 */
public class AComputerBuilder extends ComputerBuilder {
    @Override
    public ComputerBuilder buildCPU() {
        computer.setCPU("酷睿i7");
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard() {
        computer.setMainboard("罗技键盘");
        return this;
    }

    @Override
    public ComputerBuilder buildHD() {
        computer.setHD("三星屏幕");
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}