package be.demo.solid.liskovsubstitution.solution1;

public class TestCircuit {

    /**
     * The Liskov Substitution Principle (LSP) is one of the SOLID principles that states that OBJECTS of a superclass
     * should be replaceable with OBJECTS of a subclass without affecting the correctness of the program
     * <p>
     * <p>
     * This violation of Liskov Substitution Principle can lead to unexpected behavior when substituting a MotorCar with a ElectricCar.
     * In a well-designed system, subclasses should not break the expectations of the superclass
     * <p>
     * Car is the superclass
     * MotorCar and ElectricCar are subclasses
     */
    public void testMotorCar(EngineBehaviour car) {
        car.turnOnEngine();
        car.accelerate();
    }

    public void testElectricCar(ElectricBehaviour car) {
        car.turnOn();
        car.accelerate();
    }
}
