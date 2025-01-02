package org.example;

public class StringAndStringBuilder {

        public static void main(String[] args) {


            String s1 = "Hello"; // Création d'un objet String "Hello"
            String s2 = s1;      // s2 pointe vers le même objet que s1

            // Essayons de modifier le contenu
            s1 = s1 + " World"; // Une NOUVELLE instance est créée avec "Hello World"

            // Affichons les résultats
            System.out.println("s1: " + s1); // Affiche "Hello World"
            System.out.println("s2: " + s2);


            String input = "Java";
            String input2 = "madam";
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed String: " + reversed);
            String reversed2 = new StringBuilder(input2).reverse().toString();
            System.out.println("Is Palindrome: " + input2.equals(reversed2));


            String s="hello";


            s=s+"word";

            System.out.println("####s"+s);

         /**********   String  vs String builder    */
            /**
             *
             * Use String for immutable and less frequently modified strings.
             Use StringBuilder for performance-intensive scenarios involving frequent modifications.*/


/**µµµµµµµµµµµµµµµµµµµµµµµµµµ          String            µµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµ***/


            String a = "Hello World";
            String bb="aeiou";
            int vowels = 0, consonants = 0;
            a = a.toLowerCase();
            for (char ch : a.toCharArray()) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }
            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);


 /***************           String builder          ***********************************************/

            StringBuilder sb = new StringBuilder("Hello");
            StringBuilder sbb=sb;
            sb.append(" ").append("World");
            System.out.println("Appended String: " + sb);
            System.out.println("Appended String: " + sbb);

            StringBuilder sb2 = new StringBuilder("JavaProgramming");
            sb2.insert(4, " is Fun");
            System.out.println("After Insert: " + sb2);

            StringBuilder sb3 = new StringBuilder("abcdefg");
            sb3.delete(2, 5);
            System.out.println("After Deletion: " + sb3);

            StringBuilder sba =new StringBuilder("hhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            System.out.println(sba.capacity());
        }



}
