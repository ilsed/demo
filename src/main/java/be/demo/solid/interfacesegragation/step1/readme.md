* The Interface Segregation Principle (ISP) states that a class should not be forced to implement interfaces it does not
  use. In other words, a client should not be forced to depend on interfaces it does not use
*
* The Worker interface defines both work and eat methods.
* The HumanWorker class, which is a human worker, implements the Worker interface, and both work and eat methods are
  relevant.
* The Robot class also implements the Worker interface. However, robots do not eat, so the eat method is not applicable
  to them.
* This is a violation of the Interface Segregation Principle because the Robot class is forced to implement a method (
  eat) that it doesn't need. In a real-world scenario,
* it's better to break down the Worker interface into more specific interfaces, allowing classes to implement only the
  methods that are relevant to them. This way, clients are not forced to depend on methods they don't use
