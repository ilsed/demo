package be.demo.solid.liskovsubstitution.solution1;

import org.junit.jupiter.api.Test;

public class TestCircuitTest {
    @Test
    public void testCircuitMotorCar() {
        TestCircuit testCircuit = new TestCircuit();

        MotorCar vwTiguan = new MotorCar();
        testCircuit.testMotorCar(vwTiguan);
    }

    @Test
    public void testCircuitElectricCar() {
        TestCircuit testCircuit = new TestCircuit();

        ElectricCar tesla = new ElectricCar();
//        testCircuit.testMotorCar(tesla);
        testCircuit.testElectricCar(tesla);
    }
}