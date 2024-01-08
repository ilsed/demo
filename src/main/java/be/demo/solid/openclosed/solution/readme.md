# Open/Closed Principle

## What?
Units of code should be open for extension but closed for modification. You should be able to extend functionality with
additional code rather than modifying existing ones. 

## Example
We'll design a system that calculates the area of different shapes. We'll adhere to the Open/Closed Principle by
designing the system in a way that allows adding new shapes without modifying existing code.

The `Shape` interface serves as the "Port" that defines the contract for calculating the area of a shape.
The `Rectangle` and `Circle` classes are concrete implementations or "Adapters" that implement the `Shape` interface.

The `AreaCalculator` class represents the core business logic and is closed for modification. It accepts any shape that
adheres to the `Shape` interface and calculates its area without needing to change the existing code.

Now, if you want to add a new shape, let's say a `Triangle`, you can create a new adapter for the `Shape` interface
without modifying the existing `AreaCalculator` or other shape implementations. This adheres to the Open/Closed
Principle, allowing for extension without modification.
