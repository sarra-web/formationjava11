package org.example.interfaces.compositionDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Classe Composite : Manager
public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
        System.out.println("***********");
        System.out.println("Subordinates of " + name + ":");
        for (Employee employee : subordinates) {
            employee.showDetails(); // Appel récursif
        }
        System.out.println("***********");
    }
}
