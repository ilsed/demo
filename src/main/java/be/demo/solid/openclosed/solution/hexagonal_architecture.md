# Open/Closed Principle in Hexagonal Architectures

The Open/Closed Principle (OCP) is one of the SOLID principles, stating that a class should be open for extension but
closed for modification. In the context of hexagonal architectures, the OCP can be observed through the design that
allows for the extension of the system without modifying the existing core business logic.

## 1. Adapters for External Systems

- The hexagonal architecture separates the core business logic from external concerns through ports and adapters.
- Adapters act as intermediaries that interact with external systems. These adapters are open for extension as new
  external systems or services can be added by creating new adapters without modifying the core business logic.

## 2. Dependency Inversion

- The Dependency Inversion Principle, another SOLID principle closely related to OCP, is often associated with hexagonal
  architectures.
- High-level modules (core business logic) depend on abstractions (ports), and low-level modules (adapters) implement
  these abstractions. This allows for the extension of functionality by introducing new implementations (adapters)
  without modifying the core logic.

## 3. Extensible Business Logic

- The core business logic within the inner hexagon is designed to be open for extension
