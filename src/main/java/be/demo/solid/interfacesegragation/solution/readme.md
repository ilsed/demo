# Interface Segragation

## What?

Provide multiple interfaces with specific responsibilities rather than small set of general-purpose interfaces.

## Example

We've introduced two separate interfaces, Workable and Eatable, representing working and eating behaviors, respectively.
The Manager class implements both Workable and Eatable interfaces, indicating that a manager can both work and eat.
The Robot class implements only the Workable interface since robots don't eat.
Now, the WorkStation class can operate on objects that implement the Workable interface and feed objects that implement
the Eatable interface.
This way, clients can depend on the specific interfaces they need, adhering to the Interface Segregation Principle.