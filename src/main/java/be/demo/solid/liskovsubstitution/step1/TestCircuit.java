package be.demo.solid.liskovsubstitution.step1;

public class TestCircuit {

    public void testCar(Car car) {
        car.turnOnEngine();
        car.accelerate();
    }
}
