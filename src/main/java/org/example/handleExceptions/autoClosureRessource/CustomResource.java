package org.example.handleExceptions.autoClosureRessource;

 //Example: A Custom Resource with AutoCloseable
public class CustomResource implements AutoCloseable {
    private String resourceName;

    public CustomResource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println(resourceName + " is opened.");
    }

    public void doSomething() {
        System.out.println("Using " + resourceName);
    }

    @Override
    public void close() {
        System.out.println(resourceName + " is closed.");
    }
}

class CustomResourceExample {
    public static void main(String[] args) {
        try (CustomResource resource = new CustomResource("MyResource")) {
            resource.doSomething();

            Exception Exception = new Exception("aaaaaaaaa");
            throw Exception;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

