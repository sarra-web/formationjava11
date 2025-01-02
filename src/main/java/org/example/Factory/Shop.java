package org.example.Factory;


import Formation_Cert_javaSE11.part2.Product_Management_Application;

import java.math.BigDecimal;
import java.time.LocalDate;



public class Shop{

    static void order(Product p){
        BigDecimal price=p.getPrice();
    }
    static {}
    public static void main(String  args[]){

        ProductManager pm =new ProductManager();
        Product p=new Drink(101,"Tea",BigDecimal.ONE);
        Product p1=pm.createProduct(101,"Tea",BigDecimal.ONE);
        Product p2=pm.createProduct(102,"Coffee",BigDecimal.ONE);
        Product p3=pm.createProduct(103,"Cake",BigDecimal.ONE,LocalDate.now());

        order(new Product());
        order(new Food());
        order(new Drink());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}




