# Tea Factory

This is a tea ordering simulator that demonstrates the Factory Method.

## Factory Method Definition

> **The Factory Method** defines an interface for creating an object, 
> but lets subclasses decide which class to instantiate. _Factory Method_ 
> lets a class defer instantiation to subclasses.

## This Project

**TeaShop** is our high level component that depends on `Tea`.

**Tea** is our abstract class.

**EnglishTea**, **GreenTea**, **MintTea**, and **Zavarka** are our concrete tea classes and our low level components. They also depend only on `Tea`.

To see the classes in action, we can run `TeaSimulator.java` which has some teas ordered using our components.
