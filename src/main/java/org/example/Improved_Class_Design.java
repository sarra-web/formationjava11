package org.example;


class Person {
    // Fields
    private String name;
    private int age;

    // Custom constructor
    public Person(String name, int age) {
        this.name = name; // Assign name
        this.age = age;   // Assign age
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Improved_Class_Design {


    public static void main(String[] args) {
        // Create an object with custom values
        Person person = new Person("Alice", 30);

        // Call method to display object details
        person.displayInfo();
        int x = 10, y = 5;

        for (Operation op : Operation.values()) {
            System.out.println(op + ": " + op.ordinal());
            System.out.println(op + ": " + op.apply(x, y));
        }

    }


}
enum Constants {
    A,B,C


}
    enum Operation {
        ADD {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        },
        SUBTRACT {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        },
        MULTIPLY {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        },
        DIVIDE {
            @Override
            public int apply(int a, int b) {
                return a / b;
            }
        };

        // Abstract method
        public abstract int apply(int a, int b);
        public  int a;
    }




