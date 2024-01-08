# Interface Segregation Principle in Hexagonal Architectures

The Interface Segregation Principle (ISP) in hexagonal architectures can be implemented by creating specific interfaces
for different concerns or capabilities and ensuring that classes only implement the interfaces relevant to their
behavior. This promotes a more modular and flexible design.

## 1. Identify Specific Behaviors

Identify the specific behaviors or capabilities that classes within the core business logic need. These behaviors could
include operations like data retrieval, processing, or external system interactions.

## 2. Create Small, Specific Interfaces (Ports)

Create small and specific interfaces (ports) that represent these behaviors. Each interface should define a cohesive set
of methods related to a specific functionality. For example, instead of having a large generic interface
like `DataService` that includes methods for both data retrieval and data processing, create separate interfaces
like `DataRetrievalService` and `DataProcessingService`.

## 3. Implement Interfaces in Core Classes

Core classes within the inner hexagon should implement only the interfaces relevant to their behavior. This ensures that
each class is responsible for a specific aspect of the application and doesn't implement unnecessary methods. For
example, a class handling user authentication may implement the `AuthenticationService` interface, while a class dealing
with order processing may implement the `OrderProcessingService` interface.

## 4. Adapters for External Systems

Adapters representing external systems in the outer hexagon should implement the interfaces required by the core
business logic. This ensures that external systems expose only the necessary functionality to the core. For instance, if
you have a `PaymentGatewayAdapter`, it may implement a `PaymentProcessingService` interface, providing only the
payment-related methods required by the core.

## 5. Client Code Depends on Specific Interfaces

The client code within the core business logic should depend on specific interfaces relevant to its needs. This follows
the Dependency Inversion Principle and ensures that high-level modules (core) depend on abstractions (interfaces) rather
than concrete implementations. For example, if a class needs to interact with a data processing service, it should
depend on the `DataProcessingService` interface rather than a more general-purpose interface that includes unrelated
methods.

### Example Everesst
making sure that the core logic can't store new projection by only providing a smaller interface to it.

```java
// ADAPTER
public class AgreementProjectionJpaRepository implements AgreementProjectionRepository, AgreementRepository {}

// USE CASE - PROJECTOR
public interface AgreementProjectionRepository {

    void save(AgreementProjection agreement);

    void deleteByAgreementId(AgreementId agreementId);
}

// CORE DOMAIN
public interface AgreementRepository {

    Agreement getById(AgreementId agreementId);

    List<Agreement> findByJointCommitteeAndPersonIds(String jointCommittee, Set<PersonId> personIds);

    List<Agreement> findByJointCommittee(String jointCommittee);

    List<Agreement> findByPersonIds(Set<PersonId> personIds);

    List<Agreement> findBySatisfyingApplicabilityLineage(ApplicabilityLineage applicabilityLineage);
}

### Example Pseudo-code

```java
// Core business logic (Inner hexagon)
interface DataRetrievalService {
    Data retrieveData(String id);
}

interface DataProcessingService {
    void process(Data data);
}

// Adapter for External Data Source (Outer hexagon)
class ExternalDataSourceAdapter implements DataRetrievalService {
    Data retrieveData(String id) {
        // Implementation for retrieving data from an external source
    }
}

// Adapter for Data Processing (Outer hexagon)
class DataProcessorAdapter implements DataProcessingService {
    void process(Data data) {
        // Implementation for processing data
    }
}

// Client code within the core business logic
class DataHandler {
    void handleData(DataRetrievalService retrievalService, DataProcessingService processingService) {
        Data data = retrievalService.retrieveData("123");
        processingService.process(data);
    }
}


