package org.example.Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

    public static void main(String [] args) throws IOException {
        // Buffered reading from a file
        // Buffered reading from a file
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();


    }
}
