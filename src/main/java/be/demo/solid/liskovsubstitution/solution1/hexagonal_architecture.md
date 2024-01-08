# Liskov Substitution Principle in Hexagonal Architectures

The Liskov Substitution Principle (LSP) is implemented in hexagonal architectures through the design of interfaces and their implementations.

## 1. Define Clear Interfaces (Ports)

In hexagonal architectures, interfaces (or ports) define the contracts that the core business logic relies on. These interfaces represent the expected behaviors or operations that external systems must provide. For example, you might have a `PaymentService` interface in the core, defining methods like `processPayment` and `refundPayment`.

## 2. Implement Interfaces in Adapters (External Systems)

External systems, represented by adapters, implement the interfaces defined in the core. These adapters serve as bridges between the external systems and the core business logic. Adhering to Liskov Substitution, any implementation of an interface (subtypes) should be substitutable for any other implementation (base type) without causing issues. For example, you might have a `PaypalPaymentAdapter` and a `CreditCardPaymentAdapter`, both implementing the `PaymentService` interface.

## 3. Ensure Substitutability

Adapters must adhere to the contract specified by the interfaces. This means that any implementation (subtypes) should be able to replace another implementation (base type) without causing errors or unexpected behavior. For instance, if you have a method in the core that takes a `PaymentService` as a parameter, you should be able to pass an instance of `PaypalPaymentAdapter` or `CreditCardPaymentAdapter` without breaking the core logic.

## 4. Unit Testing with Substitutability

Unit tests within the core business logic should be designed to validate Liskov Substitution. This involves testing that different implementations of an interface can be used interchangeably without affecting the correctness of the tests. For example, if you have a set of unit tests for the `PaymentService` interface, they should be able to work with any implementation of this interface.

### Example Pseudo-code

```java
// Core business logic (Inner hexagon)
interface PaymentService {
    void processPayment();
}

// Adapter for Paypal (Outer hexagon)
class PaypalPaymentAdapter implements PaymentService {
    void processPayment() {
        // Implementation for processing payment via Paypal
    }
}

// Adapter for Credit Card (Outer hexagon)
class CreditCardPaymentAdapter implements PaymentService {
    void processPayment() {
        // Implementation for processing payment via Credit Card
    }
}

// Client code within the core business logic
class OrderProcessor {
    void processOrder(PaymentService paymentService) {
        // Business logic processing the order
        paymentService.processPayment();  // Liskov Substitution in action
    }
}
