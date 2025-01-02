package org.example.interfaces.compositionDesignPattern;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Création d'employés simples (feuilles)
        Developer dev1 = new Developer("Alice", "Developer");
        Developer dev2 = new Developer("Bob", "Senior Developer");

        // Création de managers
        Manager manager1 = new Manager("Charlie", "Team Lead");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);

        Manager generalManager = new Manager("Dana", "General Manager");
        generalManager.addEmployee(manager1);
        generalManager.addEmployee(new Developer("Eve", "Data Analyst"));

        // Afficher la hiérarchie
        generalManager.showDetails();
    }
}
