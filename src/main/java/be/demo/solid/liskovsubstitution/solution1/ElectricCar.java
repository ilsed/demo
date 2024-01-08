package be.demo.solid.liskovsubstitution.solution1;

/**
 * By throwing a car without an engine into the mix, we are inherently changing the behavior of our program. This is a blatant violation of Liskov substitution
 */
public class ElectricCar extends BasicCar implements ElectricBehaviour {

    public void turnOn() {
        System.out.println("ON !!");
    }

    public void accelerate() {
        System.out.println("this acceleration is crazy!");
    }
}