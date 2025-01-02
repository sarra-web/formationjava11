package org.example;


// Classe parente


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
/**
class Animal {
    String name;

    void eat() {
        System.out.println(name + " mange.");
    }

    void sleep() {
        System.out.println(name + " dort.");
    }
}

// Classe enfant
class Dog extends Animal {
    void bark() {
        System.out.println(name + " aboie.");
    }
}*/

 class TestHeritage {
    public static void main(String[] args) {
        Dog dog = new Dog();
   /**     dog.name = "Rex";
        dog.eat();  // Héritée de la classe Animal
        dog.sleep(); // Héritée de la classe Animal
        dog.bark();  // Méthode spécifique à la classe Dog*/
    }
}
/**class product{
    private String name;
    private BigDecimal price;
    public static final String a="z";

    public String getA() {
        return a;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
class Food extends product
{
    private String foodType;
    public static final String a="e";

    private LocalDate bestBefore;

    public Food(String cake, BigDecimal valueOf, LocalDate plusDays) {
        super();
    }

    public Food() {

    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getA() {
        return a;
    }
}
class Drink extends product {
    private String drinkType;

    public Drink(String tea, BigDecimal valueOf) {

    }

    public Drink() {

    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
}*/

public class Inheritance_Part_1 {
      /*  The purpose of inheritance is to reuse generic superclass behaviors and state in subclasses.
            • Superclass represents a more generic, parent type.
            • Superclasses define common attributes and behaviors.
            •   Subclass represents a more specific, child type that extends the parent type.*/
    
    
   /** public void order(product p) {
        if (p == null) {
            return;
        }

        BigDecimal price = p.getPrice();
        BigDecimal discount = BigDecimal.ZERO;

        // Check if the product is a Food item
        if (p instanceof Food) {
            Food food = (Food) p;
            if (food.getBestBefore().isEqual(LocalDate.now().plusDays(1))) {
                discount = price.multiply(BigDecimal.valueOf(0.1)); // 10% discount
            }
        }

        // Check if the product is a Drink
        if (p instanceof Drink) {
            LocalTime now = LocalTime.now();
            if (now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30))) {
                discount = price.multiply(BigDecimal.valueOf(0.2)); // 20% discount
            }
        }

        // Subtract the discount from the price
        price = price.subtract(discount);

        // Example calls to order (you likely want these outside the method for clarity)
        order(new Food("Cake", BigDecimal.valueOf(2.99), LocalDate.now().plusDays(1)));
        order(new Drink("Tea", BigDecimal.valueOf(1.99)));
    }**/





    @Override
    public String toString() {
        return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

    public static void main(String [] args) {

        //Food x1 = new Food();
      /*  product x2 = new Drink();
        x1.toString();
        x1.getName();
        x1.getFoodType();

        product x3 = x1;
        x3.toString();
        x3.getName();*/
        //       x3.getFoodType();  ==>  X

        Inheritance_Part_1 p = new Inheritance_Part_1();
        String s = p.toString();
        System.out.println("toString of this class is : " + s);


    }

}
