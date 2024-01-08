package be.demo.solid.liskovsubstitution.step1;

/**
 * Car interface with a couple of methods that all cars should be able to fulfill: turning on the engine and accelerating forward.
 */
public interface Car {

    void turnOnEngine();

    void accelerate();
}
