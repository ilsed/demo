# Liskov substitution Principle

## What?

The Liskov Substitution Principle (LSP) is one of the SOLID principles that states that OBJECTS of a superclass should
be replaceable with OBJECTS of a subclass without affecting the correctness of the program

You should be able to substitute a subclass with its base class.
All functionality in the base class should be utilized by all of its subclasses

## Example

This violation of Liskov Substitution Principle can lead to unexpected behavior when substituting a MotorCar with a
ElectricCar.
In a well-designed system, subclasses should not break the expectations of the superclass

- Car is the superclass
- MotorCar and ElectricCar are subclasses
