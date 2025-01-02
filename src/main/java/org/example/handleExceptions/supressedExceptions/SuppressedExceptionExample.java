package org.example.handleExceptions.supressedExceptions;

/**What Are Suppressed Exceptions?
A suppressed exception is an exception that occurs during the closing of a resource while
 another exception is being thrown.
 The primary exception (thrown in the try block) takes precedence,
 while the suppressed exceptions (thrown in the close() method of AutoCloseable resources)
 are recorded as secondary exceptions.
*/
class FaultyResource implements AutoCloseable {
    private String name;

    public FaultyResource(String name) {
        this.name = name;
        System.out.println(name + " opened.");
    }

    public void use() throws Exception {
        throw new Exception(name + " threw an exception during usage.");
    }

    @Override
    public void close() throws Exception {
        throw new Exception(name + " threw an exception during closure.");
    }
}

public class SuppressedExceptionExample {
    public static void main(String[] args) {
        try (FaultyResource resource = new FaultyResource("Resource1")) {
            resource.use();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());

            // Retrieve and print suppressed exceptions
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + suppressed.getMessage());
            }
        }
    }
}
