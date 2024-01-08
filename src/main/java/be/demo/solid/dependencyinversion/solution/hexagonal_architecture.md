# Dependency Inversion Principle in Hexagonal Architectures

The Dependency Inversion Principle (DIP) is a key aspect of hexagonal architectures, emphasizing the decoupling of
high-level modules (core business logic) from low-level modules (external systems or adapters). DIP promotes the
dependency on abstractions rather than concrete implementations.

## 1. Define Abstractions (Ports)

In hexagonal architectures, abstractions are defined as interfaces or ports within the core business logic. These
abstractions represent the contracts that external systems or adapters must adhere to when interacting with the core.
For example, you might have interfaces like `PaymentService` or `DataRetrievalService`.

## 2. Implement Abstractions in Adapters

Adapters in the outer hexagon implement the abstractions defined in the core. These adapters act as bridges between the
core business logic and external systems. By implementing the abstractions, adapters allow the core to depend on
high-level concepts without being tightly coupled to specific implementations. For instance, you might have
a `PaypalPaymentAdapter` or a `DatabaseAdapter` implementing the respective interfaces.

## 3. Dependency Inversion

The Dependency Inversion Principle is achieved by ensuring that high-level modules (core) depend on abstractions (
interfaces or ports), while low-level modules (adapters) implement these abstractions. This inversion of dependencies
allows for flexibility and interchangeability of components.

## 4. Injection of Dependencies

Dependencies are injected into the core business logic, adhering to the principle of dependency injection. This can be
achieved through constructor injection, method injection, or setter injection. By injecting dependencies from the
outside, the core remains agnostic about the specific implementations of the external systems it interacts with.

## 5. Unit Testing

Dependency Inversion facilitates unit testing in the core. Mocks or stubs can be easily created for the abstractions,
allowing the core to be tested independently of the actual implementations of external systems. This isolation
simplifies testing and makes it possible to verify the behavior of the core in a controlled environment.

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
    private final PaymentService paymentService;

    // Dependency is injected through constructor
    OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void processOrder() {
        // Business logic processing the order
        paymentService.processPayment();  // Dependency Inversion in action
    }
}
