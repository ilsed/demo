package be.demo.solid.liskovsubstitution.solution1;

public class Engine {
    public void on() {
        System.out.println("Engine is on");
    }

    public void powerOn(int accelarate) {
        System.out.println("Accelerated");
    }
}
