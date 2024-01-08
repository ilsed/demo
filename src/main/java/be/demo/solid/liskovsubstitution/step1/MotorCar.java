package be.demo.solid.liskovsubstitution.step1;

/**
 * As our code describes, we have an engine that we can turn on, and we can increase the power.
 */
public class MotorCar implements Car {

    private final Engine engine = new Engine();

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}