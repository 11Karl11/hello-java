package test.java.designMode.builder.one;

/**
 * @author karl xie
 * Created on 2020-03-12 20:49
 */
public class AComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        computer.setCPU("酷睿i7");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("罗技键盘");
    }

    @Override
    public void buildHD() {
        computer.setHD("三星屏幕");
    }

    @Override
    public Computer build  () {
        return computer;
    }
}