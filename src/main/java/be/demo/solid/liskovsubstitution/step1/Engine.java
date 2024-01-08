package be.demo.solid.liskovsubstitution.step1;

public class Engine {
    public void on() {
        System.out.println("Engine is on");
    }

    public void powerOn(int accelarate) {
        System.out.println("Accelerated");
    }
}
