package org.example.handleExceptions;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }



        try {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }




    }
}
