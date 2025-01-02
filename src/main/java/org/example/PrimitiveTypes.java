package org.example;

public class PrimitiveTypes {

    public static void main(String[] args){


        System.out.print("hello");
   /***
        byte	Stores whole numbers from -128 to 127
        short	Stores whole numbers from -32,768 to 32,767
        int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean	Stores true or false values
        char	Stores a single character/letter or ASCII values
    */

        byte x=2,y=3,z=5;
        z= (byte) (x+y);

        float a=x/y;

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char letter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";
        System.out.println("Original letter: " + letter);
        System.out.println("Next letter: " + (char) (letter + 1));
        System.out.println("Previous letter: " + (char) (letter - 1));



        System.out.println("Byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
        System.out.println("Short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
        System.out.println("Integer: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
        System.out.println("Long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
        System.out.println("Float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
        System.out.println("Double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
        System.out.println("Char: Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
    }
}
