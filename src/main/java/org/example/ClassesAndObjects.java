package org.example;

public class ClassesAndObjects {

   private int r;
    private static int e;
        public static void main(String[] args) {
/**
 * var x; // Error: Cannot use `var` without an initializer.
 * // Error: `var` is not allowed for class-level fields.
 * var x = null; // Error: Type cannot be inferred.
 * */
        // Create objects
        var car1 = new Car("Toyota", "Red", 120);
        Car car2 = new Car("Honda", "Blue", 100);
        car2.getBrand();
        // Use methods
        car1.displayDetails();
        car1.accelerate(30);

        car2.displayDetails();
        car2.accelerate(50);

        var a=car2.accelerate();
        System.out.println(a);


        final double PI = 3.14159; // Declaring a constant
        final int MAX_USERS = 100;


        System.out.println("Value of PI: " + PI);
        System.out.println("Maximum Users: " + MAX_USERS);


    }
}
 class Car {
    // Fields
     private String brand;
     private String color;
     private int speed;

     public static final String a="ssle";

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public String getBrand() {
         return brand;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }


     // Constructor
    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;

        this.speed = speed;
    }

    // Method


     public static void mainz() {
     //    getBrand();
     }
    public void displayDetails() {

        System.out.println(a);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("The car accelerated to: " + speed + " km/h");
    }
     public int accelerate() {
         return speed;
     }

}

