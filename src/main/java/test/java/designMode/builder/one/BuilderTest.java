package test.java.designMode.builder.one;

/**
 * @author karl xie
 * Created on 2020-03-12 20:51
 */
public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Director(new AComputerBuilder()).construct();
        computer.show();
    }
}