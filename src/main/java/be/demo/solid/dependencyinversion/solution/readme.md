# Dependency Injection Principle

## What?

Use abstractions to decouple dependencies between different parts of the systems. Direct calls between units of code
shouldn't be done, instead interfaces or abstractions should be used

The **Dependency Injection (DI)** principle is about providing the dependencies that an object needs from the **outside
** rather than creating them internally.

## Example

Library can be constructed with an BookConsolePrinter or a BookInMemoryPrinter
The Library expects a class implementing the interface BookPrinter