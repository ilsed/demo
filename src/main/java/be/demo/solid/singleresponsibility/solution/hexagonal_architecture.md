# Single Responsibility Principle in Hexagonal Architectures

The Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning that it
should have only one responsibility. In the context of hexagonal architectures, which promote the separation of concerns
and a clean architectural structure, you can observe the SRP being adopted in various components of the system.

## 1. Core Business Logic

- The core business logic of the application, residing in the inner hexagon, should have a single responsibility. It
  focuses on handling the domain logic, business rules, and application-specific behavior.
- For example, a service or a set of services within the core may be responsible for processing orders, managing user
  accounts, or handling other domain-specific tasks.

## 2. Ports and Adapters

- The hexagonal architecture separates the core application logic from external concerns using ports and adapters.
- Ports represent interfaces or contracts that the core logic depends on, such as repositories, services, or other
  application-specific abstractions.
- Adapters are implementations of these ports and are responsible for interacting with the external world, such as
  databases, user interfaces, or external services.

## 3. Hexagonal Layers

- The hexagonal architecture itself reflects a separation of concerns into layers. The inner hexagon encapsulates the
  core business logic, while the outer hexagon contains the adapters responsible for interacting with the external
  environment.
- This separation allows changes in the external systems (adapters) to be made without affecting the internal core
  logic, and vice versa.

## 4. External Adapters

- Each external system or service that the application interacts with should have its own adapter, encapsulating the
  logic specific to that system. For example, there might be a database adapter, a user interface adapter, or a
  messaging adapter.
- Each adapter should have a single responsibility related to its specific interaction with the external system.

## 5. Testing

- Following the SRP allows for more focused and easier testing. The core business logic can be thoroughly tested with
  unit tests, mocking or stubbing external dependencies.
- Adapters, being responsible for interaction with external systems, can be tested separately with integration tests,
  ensuring that they correctly adapt the core logic t
