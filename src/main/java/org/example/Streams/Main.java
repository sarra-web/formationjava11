package org.example.Streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


/***
 *  flatMap
 * The flatMap method in Java Streams is used to flatten nested structures or map a
 * stream of elements to another stream.
 * It transforms each element of a stream into another stream,
 * then merges all resulting streams into a single flat stream.
 */





public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Define a Consumer that prints each name
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        Supplier<String> printName2 = () -> {
            String a="myname";
            return a;};
        // Use Consumer with forEach
        names.forEach(printName);


        /**FlatMap*/

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Carrot", "Date"),
                Arrays.asList("Eggfruit", "Fig")
        );

        // Flatten the nested list and collect to a flat list
        List<String> flatList = nestedList.stream()
                .flatMap(Collection::stream) // Flattens each inner list
                .collect(Collectors.toList());

        System.out.println(flatList);

        List<String> sentences = Arrays.asList("Hello world", "Java is fun");

        // Split sentences into words and flatten the result
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        Integer words2 = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .mapToInt(i->i.lastIndexOf(""))
                .sum();

        System.out.println(words); // Output: [Hello, world, Java, is, fun]


        List<Produit> produits=new ArrayList<>();
        Produit produit1=new Produit("prod1", BigDecimal.ONE);
        List<String> list=List.of("ref1P1","ref2P1","ref3P1");
        produit1.setRef(list);

        Produit produit2=new Produit("prod2",BigDecimal.TEN);
        List<String> list2=List.of("ref1P2","ref2P2","ref3P2");
        produit2.setRef(list2);

        Produit produit3=new Produit("prod3",BigDecimal.TEN);
        List<String> list3=List.of("ref1P3","ref2P3","ref3P3");

        produit3.setRef(list3);

        produits.add(produit2);
        produits.add(produit1);
        produits.add(produit3);

        List<String> prodsRefs=produits.stream().
                flatMap(produit -> produit.getRef().stream())
                .collect(Collectors.toList());
        System.out.println(prodsRefs);

        Optional<String> prodsNames=produits.stream().
                map(produit -> produit.getName()).reduce((s1,s2)->" "+s2);

        System.out.println(prodsNames.get());

        System.out.println(prodsRefs);


    }
}
