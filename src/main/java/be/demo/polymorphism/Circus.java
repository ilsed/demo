package be.demo.polymorphism;

import java.util.List;

public class Circus {

    List<Cat> cats;
    List<Dog> dogs;

    public void perform() {
        // dogs.stream().map(aDog -> System.out.println(aDog.bark()));
        cats.stream().map(Cat::meow);
    }
}
