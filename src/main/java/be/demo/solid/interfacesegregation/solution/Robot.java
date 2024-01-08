package be.demo.solid.interfacesegregation.solution;

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}