package be.demo.solid.interfacesegregation.step1;

class WorkStation {

    void operate(Worker worker) {
        worker.work();
        worker.eat();
    }
}