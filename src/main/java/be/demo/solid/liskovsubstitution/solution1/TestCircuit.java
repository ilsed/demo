package be.demo.solid.liskovsubstitution.solution1;

public class TestCircuit {
    public void testMotorCar(EngineBehaviour car) {
        car.turnOnEngine();
        car.accelerate();
    }

    public void testElectricCar(ElectricBehaviour car) {
        car.turnOn();
        car.accelerate();
    }
}
