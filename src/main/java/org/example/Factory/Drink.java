package org.example.Factory;

import java.math.BigDecimal;

public class Drink extends Product {

    @Override
    public String toString() {
        return super.toString()+"Drink{" +
                "drinkType='" + drinkType + '\'' +
                '}';
    }

    private String drinkType;

    public Drink(int id, String name, BigDecimal price/*,Rating rating*/){
        super(id, name, price/*, rating*/);
    }
    @Override
    public BigDecimal getPrice() {
        System.out.println("Tow");

        return BigDecimal.TEN;
    }
    public Drink(String tea, BigDecimal valueOf) {

    }

    public Drink() {

    }

    public String getDrinkType() {
        super.getPrice();
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
}