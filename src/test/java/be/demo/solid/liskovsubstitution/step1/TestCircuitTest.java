package be.demo.solid.liskovsubstitution.step1;

import org.junit.jupiter.api.Test;

public class TestCircuitTest {

    @Test
    public void testCircuitMotorCar() {
        TestCircuit testCircuit = new TestCircuit();

        MotorCar vwTiguan = new MotorCar();
        testCircuit.testCar(vwTiguan);
    }

    @Test
    public void testCircuitElectricCar() {
        TestCircuit testCircuit = new TestCircuit();

        ElectricCar tesla = new ElectricCar();
        testCircuit.testCar(tesla);
    }
}
