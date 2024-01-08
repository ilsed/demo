package be.demo.solid.interfacesegregation.solution;

class WorkStation {
    void operate(Workable worker) {
        worker.work();
    }

    void feed(Eatable eater) {
        eater.eat();
    }
}