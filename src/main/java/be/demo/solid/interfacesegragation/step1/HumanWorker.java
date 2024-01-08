package be.demo.solid.interfacesegragation.step1;

class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }
}