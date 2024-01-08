package be.demo.solid.interfacesegragation.solution;

class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Manager is working.");
    }

    @Override
    public void eat() {
        System.out.println("Manager is eating.");
    }
}