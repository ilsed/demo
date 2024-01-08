package be.demo.solid.interfacesegragation.solution;

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}