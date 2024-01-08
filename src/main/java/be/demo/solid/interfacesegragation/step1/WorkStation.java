package be.demo.solid.interfacesegragation.step1;

class WorkStation {

    void operate(Worker worker) {
        worker.work();
        worker.eat();
    }
}