package org.example.handleExceptions.autoClosureRessource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/***
 * Java provides a feature called try-with-resources, introduced in Java 7,
 * for managing resources such as files, streams, and database connections.
 * The feature ensures that resources are closed automatically when no longer needed,
 * avoiding resource leaks.
 */
//Reading a File Using Try-With-Resources
public class AutoCloseExample {
    public static void main(String[] args) {

        try{}
        catch (Exception e){}

        try (BufferedReader reader = new BufferedReader(new FileReader("pom.xml"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

