package org.example.handleExceptions.autoClosureRessource;

import java.io.*;
// Multiple Resources in Try-With-Resources You can use multiple resources in a single try block,
// separated by semicolons.

public class MultiResourceExample {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("pom.xml"));
                PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

