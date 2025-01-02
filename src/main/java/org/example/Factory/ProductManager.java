package org.example.Factory;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {

    public Product createProduct(int id, String name, BigDecimal price, LocalDate bestBefore){
        return new Food(id,name,price,bestBefore);
    }

    public Product createProduct(int id, String name, BigDecimal price ){
        return new Drink(id,name,price);
    }
}
