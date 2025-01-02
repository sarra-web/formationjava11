package org.example.Factory;

import java.math.BigDecimal;

public class Product {
    public static final BigDecimal DisCOUNT_RATE=BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    // private Rating rating;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int id, String name, BigDecimal price/*, Rating rating*/) {
        this.id = id;
        //  this.rating = rating;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }


    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Product)){
            return false;
        }

        Product other =(Product) obj;
        return this.id==other.id;
    }

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
        System.out.println("null");
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
