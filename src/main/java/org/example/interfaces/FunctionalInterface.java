package org.example.interfaces;



/**
 *
 Functional Interface is an interface that defines a single abstract operation (function).

 Problem:
 It is not possible to partially implement an interface. The concrete class must implement all abstract methods that it has inherited.
 An interface with many abstract methods is not convenient to use. A class may have to provide implementations for methods that it does not actually need.

 Solution:
 A class may implement as many interfaces as needed.
 • An interface can define just one abstract method; no extra operations that could be
 "unwanted baggage" has to be implemented.
 It is a flexible and recommended approach to designing interfaces.
 * */

public interface FunctionalInterface {
}
