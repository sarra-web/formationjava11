package org.example.nested_inner_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 Classes can be defined inside other classes to encapsulate logic and constrain context of use.
 Type of the nested class depends on the context in which it is used.
 - Static nested class is associated with the static context of the outer class.
 - Member inner class is associated with the instance context of the outer class.
 - Local inner class is associated with the context of specific method.
 - Anonymous inner class is an inline implementation or extension of an interface or a class.
 ⚫ Static and member nested classes can be defined as:
 - public, protected, or default-can be accessed externally
 private can be referenced only inside their outer class
 */

class Outer {
    private String message = "Hello from Outer";

    // Inner class
    class Inner {
        void displayMessage() {
            System.out.println(message); // Accessing private field of the outer class
        }
    }
}

class Outer2 {
    private static String message = "Hello from Outer";

    // Nested static class
    static class Nested {
        void displayMessage() {
            System.out.println(message); // Accessing static field of the outer class
        }
    }
}
/***
    An anonymous inner class in Java is a type of inner class that is declared and instantiated in a
 single expression. It has no name and is typically used when you need to override the behavior of a
 class or interface, but you don't want to create a separate named class for this.
*/
abstract class Sarra {
    abstract void work();
    abstract void stady();
}



@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

/***
 * With Functional Interfaces A lambda expression works with any interface that has only one abstract method. Common examples include:
 *
 * Runnable (run())
 * Callable (call())
 * Comparator (compare())
 *Lambda expressions, introduced in Java 8, provide a concise way to express instances
 *  of functional interfaces (interfaces with a single abstract method). They help simplify code,
 *  especially for functional programming tasks like filtering, mapping, or reducing collections.
 */
/***Summary of Reference method
        Type	Syntax	Example
        Reference to a static method	ClassName::methodName	Math::max
        Reference to an instance method	instance::methodName	myPrinter::print
        Arbitrary object's instance method	ClassName::methodName	String::toLowerCase
        Reference to a constructor	ClassName::new	ArrayList::new
*/
public class NestedAndInnerAndaAnonymousInnerClassesAndLambdaExpression {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // Requires an instance of Outer
        inner.displayMessage();
        Outer2.Nested nested = new Outer2.Nested(); // Does NOT require an instance of Outer
        nested.displayMessage();

        // Anonymous inner class extending Animal
        Sarra sarra = new Sarra() {
            @Override
            void work() {
                System.out.println("I work");
            }

            @Override
            void stady() {

            }
        };

        sarra.work(); // Output: Meow!
        // Anonymous inner class implementing Greeting
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, World!");
            }
        };

        greeting.sayHello(""); // Output: Hello, World!

        Greeting greeting2 = (final String name) -> System.out.println("Hello, " + name);
        greeting2.sayHello("Sarra"); // Output: Hello, World!
        Runnable task = () -> System.out.println("Task is running...");

        Thread thread = new Thread(task);
        thread.start();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambdas with Streams
        List<Integer> evenNumbers = numbers.stream()
                .filter((n) -> n % 2 == 0) // Lambda for filtering
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // Output: [2, 4]

        evenNumbers.forEach(System.out::println);



    }
}
/**Comparator*/
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(3, "Alice"),
                new Employee(1, "Charlie"),
                new Employee(2, "Bob")
        );

        // Sort by ID (using Comparator)
        employees.sort(Comparator.comparingInt(e -> e.id));
        System.out.println("Sorted by ID: " + employees);

        // Sort by Name (using Comparator)
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by Name: " + employees);
    }
}

 class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Define Predicate for even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Filter even numbers using Predicate
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (isEven.test(number)) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);

        // Combine Predicates with "and", "or", and "negate"
        Predicate<Integer> isGreaterThanThree = n -> n > 3;

        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (isEven.and(isGreaterThanThree).test(number)) {
                filteredNumbers.add(number);
            }
        }
        System.out.println("Numbers greater than 3 and even: " + filteredNumbers);
    }
}
