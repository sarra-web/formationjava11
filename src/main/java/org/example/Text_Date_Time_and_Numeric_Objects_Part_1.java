package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Text_Date_Time_and_Numeric_Objects_Part_1 {
    public static void main(String args[]){

        /**
         * 	•  Manipulate text values using String and StringBuilder classes // deja manipulé
         * 	•   Describe primitive wrapper classes   // deja manipulé
         * 	• Perform string and primitive conversions   // deja manipulé
         *  Handle decimal numbers using BigDecimal class   // deja manipulé
         * */


        System.out.println("");


        /**parse and format numeric values*/

            String intStr = "123";
            String doubleStr = "45.67";

            int intValue = Integer.parseInt(intStr);  // Converts String to int
            double doubleValue = Double.parseDouble(doubleStr); // Converts String to double

            System.out.println("Parsed int: " + intValue);
            System.out.println("Parsed double: " + doubleValue);


        double number = 12345.678;

        // Format as Currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println("Currency Format: " + currencyFormat.format(number));

        // Format as Percentage
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println("Percentage Format: " + percentFormat.format(0.75));


        // Format with 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Formatted with 2 decimal places: " + df.format(number));

        // Format with comma separator
        DecimalFormat dfWithComma = new DecimalFormat("#,###.00");
        System.out.println("Formatted with commas: " + dfWithComma.format(number));

        String input = "12345.6789";

        // Parse the string into a double
        double number2 = Double.parseDouble(input);

        // Format the number with 2 decimal places
        DecimalFormat df2 = new DecimalFormat("#.00");
        String formattedNumber = df2.format(number2);

        System.out.println("Original: " + input);
        System.out.println("Formatted: " + formattedNumber);


        BigDecimal nbr = new BigDecimal("12345.6789");

        // Round to 2 decimal places
        BigDecimal rounded = nbr.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Rounded: " + rounded);

    }
}
