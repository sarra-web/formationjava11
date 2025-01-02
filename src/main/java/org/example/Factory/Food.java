package org.example.Factory;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product
{
    @Override
    public String toString() {
        return "Food{" +
                "foodType='" + foodType + '\'' +
                ", bestBefore=" + bestBefore +
                '}';
    }

    private String foodType;
    public static final String a="e";

    private LocalDate bestBefore;

    @Override
    public BigDecimal getPrice() {
        System.out.println("One");

        return BigDecimal.ONE;
    }

    public Food(int id,String name, BigDecimal valueOf, LocalDate plusDays) {


        super( id, name,  valueOf);
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
