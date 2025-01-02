package org.example;

import java.util.*;

/***
 *           Collection
 *          /    |      \
 *         List  Set    Queue
 *        /       \        \
 *   ArrayList  HashSet   PriorityQueue
 *    LinkedList TreeSet  ArrayDeque
 *
 *          Map
 *         /   \
 *    HashMap  TreeMap
 */


public class Collections {

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            System.out.println(list.size());
            list.add("Apple");
            System.out.println(list.size());
            list.add(1,"Banana");
            System.out.println(list.size());
            list.add("Apple"); // Les doublons sont autorisés
            System.out.println(list.size());
            for (String fruit : list) {
                System.out.println(fruit);
            }
/** Set */
            HashSet<String> colors = new HashSet<>();

            colors.add("Red");
            colors.add("Blue");
            colors.add("Green");

            // Supprimer un élément spécifique
            colors.remove("Blue");

            // Afficher après suppression
            System.out.println(colors); // [Red, Green]

            // Supprimer tous les éléments
            colors.clear();
            System.out.println(colors.isEmpty());





            HashSet<String> set1 = new HashSet<>();
            set1.add("A");
            set1.add("B");
            set1.add("C");

            HashSet<String> set2 = new HashSet<>();
            set2.add("B");
            set2.add("C");
            set2.add("D");

            System.out.println("set1"+set1);
            System.out.println("set2"+set2);
            // Union
            HashSet<String> union = new HashSet<>(set1);
            union.addAll(set2); // Ajout de tous les éléments de set2
            System.out.println("Union: " + union); // [A, B, C, D]

            // Intersection
            HashSet<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2); // Retenir les éléments communs
            System.out.println("Intersection: " + intersection); // [B, C]

            // Différence
            HashSet<String> difference = new HashSet<>(set1);
            difference.removeAll(set2); // Supprimer les éléments présents dans set2
            System.out.println("Difference: " + difference); // [A]

/**
 * Une Deque (Double-Ended Queue) est une structure de données qui permet
 d'ajouter ou de retirer des éléments aux deux extrémités : en tête (avant) ou en queue (après).
 * Elle combine les fonctionnalités de piles (LIFO) et de queues (FIFO).
 *
 * Java fournit plusieurs implémentations de Deque, comme ArrayDeque et LinkedList.
 *
 * ArrayDeque : Une implémentation rapide et non-synchronisée basée sur un tableau.
 * LinkedList : Une implémentation basée sur une liste chaînée, pouvant être utilisée comme une pile ou une queue.
 */
//  Exemple Simple avec ArrayDeque
            Deque<String> deque = new ArrayDeque<>();

            // Ajouter des éléments aux deux extrémités
            deque.addFirst("A");
            deque.addLast("B");
            deque.addLast("C");

            System.out.println("Deque: " + deque); // [A, B, C]

            // Consulter les extrémités
            System.out.println("First: " + deque.peekFirst()); // A
            System.out.println("Last: " + deque.peekLast());   // C

            // Retirer des éléments
            deque.removeFirst(); // Supprime "A"
            System.out.println("Deque after removeFirst: " + deque); // [B, C]

            deque.removeLast(); // Supprime "C"
            System.out.println("Deque after removeLast: " + deque);  // [B]

//Utilisation comme une Pile (LIFO)
            Deque<String> stack = new ArrayDeque<>();

            // Pousser des éléments (push)
            stack.push("A");
            stack.push("B");
            stack.push("C");

            System.out.println("Stack: " + stack); // [C, B, A]

            // Retirer des éléments (pop)
            System.out.println("Pop: " + stack.pop()); // C
            System.out.println("Pop: " + stack.pop()); // B

            System.out.println("Stack after pops: " + stack); // [A]
//Utilisation comme une Queue (FIFO)

            Deque<String> queue = new ArrayDeque<>();


            // Ajouter des éléments (offer)
            queue.offer("A");
            queue.offer("B");
            queue.offer("C");

            System.out.println("Queue: " + queue); // [A, B, C]

            // Retirer des éléments (poll)
            System.out.println("Poll: " + queue.poll()); // A
            System.out.println("Poll: " + queue.poll()); // B

            System.out.println("Queue after polls: " + queue); // [C]

            // hash map

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Alice", 25);
            map.put("Bob", 30);

            System.out.println(map.get("Alice")); // Affiche 25


        }
    }


