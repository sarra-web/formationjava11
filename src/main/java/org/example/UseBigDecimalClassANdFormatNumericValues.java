package org.example;

import java.math.BigDecimal;
import java.util.Locale;

public class UseBigDecimalClassANdFormatNumericValues {

    public static void main(String[] args) {
        // Create BigDecimal instances
        BigDecimal num1 = new BigDecimal("10.50");  // Using String (recommended)
        BigDecimal num2 = BigDecimal.valueOf(3.0); // Using valueOf

        // Perform arithmetic operations
        BigDecimal sum = num1.add(num2);           // Addition
        BigDecimal difference = num1.subtract(num2); // Subtraction
        BigDecimal product = num1.multiply(num2);   // Multiplication
        BigDecimal quotient = num1.divide(num2, 32, BigDecimal.ROUND_HALF_UP); // Division with rounding

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);



    }




}
