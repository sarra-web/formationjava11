package org.example;

import java.util.Random;

public class PrimitiveTypesOperators {

    public static void main(String args[]){

        //int a=0b0; //binary
        //short b=052; //octal
        byte c=127; // decimal
        long d=0x2A; // hex
        float e=1.99E2F;
        double f=1.99;
        long g=5,h=c;
        float i=g;
        char j='A';
        j++;
        System.out.println("La valeur de j est :"+j);
        char k='\u0041',l='\101';
        int s;
        s=77;

        boolean z=false;

        //int aa=42L;//false
/**
 *
 *
 Increment and decrement operators has prefix and postfix positions:
 y=++x x is incremented first and then the result is assigned to y.
 y=--x x is decremented first and then the result is assigned to y.
 y=x++ y is assigned the value of x first and then x is incremented.
 y=x-- y is assigned the value of x first and then x is decremented.
 *
 *
 *
 */
        int x = 5;
        System.out.println("Initial value: " + x);
        System.out.println("Post-increment: " + (x++));
        System.out.println("After post-increment: " + x);
        System.out.println("Pre-increment: " + (++x));
        System.out.println("Post-decrement: " + (x--));
        System.out.println("After post-decrement: " + x);
        System.out.println("Pre-decrement: " + (--x));
       //double result = (a * b) + (c / d) - e;


        System.out.println("##########################################################XOR#####################################################################");
        boolean a = true, b = false;
        System.out.println(a ^ b); // true, because one condition is true
        System.out.println(a ^ a); // false, because both conditions are the same
        System.out.println(b ^ b); // false, because both conditions are false
        System.out.println(b ^ a);
//////////////////////////:differnece entre || et | ////////////////////////////////////////////////////
        /**
         * || : Utilisez-le pour des expressions booléennes dans des conditions où vous souhaitez éviter d'évaluer inutilement la deuxième condition.
         * | : Utilisez-le pour des opérations au niveau des bits sur des entiers ou lorsque vous avez besoin que les deux conditions soient évaluées dans une logique booléenne.
         * */
        shortCircuitEvaluation();


        // Section 1: Basic Arithmetic Operations
        basicArithmeticOperations();

        // Section 2: Math Class Operations
        mathClassOperations();

        // Section 3: Trigonometric Functions
        trigonometricFunctions();

        // Section 4: Logarithms
        logarithms();

        // Section 5: Random Number Generation
        randomNumbers();

        // Section 6: Custom Mathematical Formulas
        calculateCircleArea();
        solveQuadraticEquation();

        // Section 7: Factorial Calculation
        calculateFactorial(5);



  /******************************JShell****************
   * JShell is a REPL (Read-Eval-Print-Loop) tool introduced in Java 9.
   * It allows you to interactively write and execute Java code snippets without needing to create a full Java program or compile it.
   * This makes it a great tool for experimenting with Java features, learning, or testing small pieces of code quickly.
   *
   * ********************/














    }

    private static void shortCircuitEvaluation() {
        System.out.println("////////////shortCircuitEvaluation");


        int x = 5, y = 10;

        if (x > 0 || y++ > 10) { // Comme x > 0 est vrai, y++ n'est pas évalué.
            System.out.println("Condition vraie");
        }
        System.out.println("y = " + y); // Résultat : y = 10 (y++ n'a pas été exécuté)

        //////


        if (x > 0 | y++ > 10) { // Les deux conditions x > 0 et y++ > 10 sont évaluées.
            System.out.println("Condition vraie");
        }
        System.out.println("y = " + y); // Résultat : y = 11 (y++ a été exécuté)

        int a = 5;  // Binaire : 0101
        int b = 3;  // Binaire : 0011
        int result = a | b; // Résultat binaire : 0111 (7 en décimal)
        System.out.println(result); // Résultat : 7



        boolean aa = true;
        boolean bb = false;

        if (aa & bb) {  // Les deux conditions sont évaluées
            System.out.println("Les deux sont vrais.");
        } else {
            System.out.println("L'une des conditions est fausse.");  // Affiche ce message
        }
        int xx = 5;  // Binaire : 0101
        int yy = 3;  // Binaire : 0011
        int result2 = xx & yy; // Résultat binaire : 0001 (1 en décimal)
        System.out.println(result2); // Affiche : 1

        boolean aa2 = true;
        boolean bb2 = false;

        if (aa2 && bb2) {  // Si la premiere condition est fausse la deuxième condition ne sera  pas évaluée
            System.out.println("Les deux sont vrais.");
        } else {
            System.out.println("L'une des conditions est fausse.");  // Affiche ce message
        }




    }

    // Section 1: Basic Arithmetic Operations
    public static void basicArithmeticOperations() {
        int a = 10, b = 5;

        System.out.println("\n--- Basic Arithmetic Operations ---");
        System.out.println("Addition: " + (a + b));  // 15
        System.out.println("Subtraction: " + (a - b));  // 5
        System.out.println("Multiplication: " + (a * b));  // 50
        System.out.println("Division: " + (a / b));  // 2
        System.out.println("Remainder (modulus): " + (a % b));  // 0
    }

    // Section 2: Math Class Operations
    public static void mathClassOperations() {
        double base = 2, exponent = 3, number = -5.6;

        System.out.println("\n--- Math Class Operations ---");
        System.out.println("Power (2^3): " + Math.pow(base, exponent));  // 8.0
        System.out.println("Square root of 16: " + Math.sqrt(16));  // 4.0
        System.out.println("Absolute value: " + Math.abs(number));  // 5.6
        System.out.println("Floor: " + Math.floor(number));  // -6.0
        System.out.println("Ceiling: " + Math.ceil(number));  // -5.0
        System.out.println("Round: " + Math.round(number));  // -6
    }

    // Section 3: Trigonometric Functions
    public static void trigonometricFunctions() {
        double angle = Math.toRadians(45);  // Convert degrees to radians

        System.out.println("\n--- Trigonometric Functions ---");
        System.out.println("Sine: " + Math.sin(angle));  // 0.7071
        System.out.println("Cosine: " + Math.cos(angle));  // 0.7071
        System.out.println("Tangent: " + Math.tan(angle));  // 1.0
    }

    // Section 4: Logarithms
    public static void logarithms() {
        double number = 10;

        System.out.println("\n--- Logarithms ---");
        System.out.println("Natural logarithm: " + Math.log(number));  // 2.3026
        System.out.println("Base 10 logarithm: " + Math.log10(number));  // 1.0
    }

    // Section 5: Random Number Generation
    public static void randomNumbers() {
        Random random = new Random();

        System.out.println("\n--- Random Number Generation ---");
        System.out.println("Random number (0 to 99): " + random.nextInt(100));  // 0 to 99
        System.out.println("Random double: " + random.nextDouble());  // Between 0.0 and 1.0
    }

    // Section 6.1: Calculate Circle Area
    public static void calculateCircleArea() {
        double radius = 7;
        double area = Math.PI * Math.pow(radius, 2);  // π * r^2

        System.out.println("\n--- Circle Area Calculation ---");
        System.out.println("Area of the circle: " + area);  // 153.93804002589985
    }

    // Section 6.2: Solve Quadratic Equation
    public static void solveQuadraticEquation() {
        double a = 1, b = -3, c = 2;  // x^2 - 3x + 2 = 0

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("\n--- Quadratic Equation Solver ---");
        System.out.println("Root 1: " + root1);  // 2.0
        System.out.println("Root 2: " + root2);  // 1.0
    }

    // Section 7: Factorial Calculation
    public static void calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("\n--- Factorial Calculation ---");
        System.out.println("Factorial of " + number + ": " + factorial);  // 120
    }


//equality , Relational and conditional operators

}
