package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Inheritance_Part_2and3 {

    public static void main(String  args[]){
        System.out.println("hello");
    }



}
/**Factory     design pattern*/
class ProductFactory{

    public static PRODUCT createProduct(){
        String productType="";

        switch (productType){
            case "FOOD":
                return new FOOD();
            case "DRINK":
                return new DRINK();
        }
        return null;
    }
}
abstract class PRODUCT{
    public PRODUCT(){}
}
class FOOD extends PRODUCT{
    public FOOD(){

    }
}
class DRINK extends PRODUCT{
    public DRINK(){

    }
}

/**Factory     design pattern*/

final class A{

}
//class B extends A{ }  // error final class cannot be extended
// Définition d'une classe abstraite
abstract class Animal {
    // Une méthode abstraite : aucune implémentation
    abstract void makeSound();

    // Une méthode concrète : avec implémentation
    void sleep() {
        System.out.println("L'animal dort...");
    }
}

// Classe concrète qui hérite de la classe abstraite
class Dog extends Animal {
    // Implémentation obligatoire de la méthode abstraite

    /**@Override est facultatif
     *@Override Aide à détecter les erreurs : Si vous faites une erreur dans la signature de la méthode (par exemple, en changeant son nom ou ses paramètres), le compilateur lèvera une erreur.
     * Sans @Override, le compilateur pourrait penser que vous avez simplement déclaré une nouvelle méthode au lieu de remplacer une méthode existante.
     * */

    @Override
    void makeSound() {
        System.out.println("Le chien aboie : Woof Woof!");
    }
}

// Autre classe qui hérite de Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Le chat miaule : Meow Meow!");
    }
}

// Classe principale
 class Main {
    public static void main(String[] args) {
        // Impossible d'instancier une classe abstraite
        // Animal animal = new Animal(); // Erreur !

        // Créer des objets des classes concrètes
        Animal dog = new Dog();
        dog.makeSound();  // Output: Le chien aboie : Woof Woof!
        dog.sleep();      // Output: L'animal dort...

        Animal cat = new Cat();
        cat.makeSound();  // Output: Le chat miaule : Meow Meow!
        cat.sleep();      // Output: L'animal dort...
    }
}



