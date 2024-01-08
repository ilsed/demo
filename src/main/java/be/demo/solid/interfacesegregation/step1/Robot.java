package be.demo.solid.interfacesegregation.step1;

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

    @Override
    public void eat() {
        // Oops! Robots don't eat, but they are forced to implement the eat method.
        System.out.println("Robot is eating (this should not happen).");
    }
}