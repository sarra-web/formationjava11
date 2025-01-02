package org.example;

import java.util.Arrays;
import java.util.OptionalInt;

/**
     * This class represents a basic Employee.
     */
     class Employee {
        private String name;
        private int id;
        private double salary;

        /**
         * Constructor to initialize an Employee object.
         * @param name The name of the employee.
         * @param id The ID of the employee.
         * @param salary The salary of the employee.
         */
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
         * Gets the name of the employee.
         * @return The employee's name.
         */
        public String getName() {
            return name;
        }

        /**
         * Gets the ID of the employee.
         * @return The employee's ID.
         */
        public  int getId() {
            return id;
        }

        /**
         * Calculates the annual salary of the employee.
         * @return The annual salary.
         */
        public double calculateAnnualSalary() {
            return salary * 12;
        }

        int a(int ... a){

            int b= Arrays.stream(a).sum();
            OptionalInt c= Arrays.stream(a).findFirst();
            System.out.println("first element: = "+c);
            System.out.println("sum: = "+b);
            System.out.println();
            return a.length;
        }

    }

    // Main class to demonstrate Employee



public class documentClasses {
    public static void main(String[] args) {
        System.out.println("hello");

        Employee emp = new Employee("Alice", 101, 5000.0);

        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
   Employee Z = emp;
   emp.setName("eeeeeee");
        System.out.println("Name: " + Z.getName());
        System.out.println("Name: " + emp.getName());




        int b=emp.a();
        int a=emp.a(1,3,3,4,4,2);
        System.out.println("nbrParam: = "+a);
        System.out.println("Info of a: = "+a);
        System.out.println("Info of b: = "+b);

    }
}
