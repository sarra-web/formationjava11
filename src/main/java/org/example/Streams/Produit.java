package org.example.Streams;

import java.math.BigDecimal;
import java.util.List;

public class Produit {
    List<String> ref;

    public List<String> getRef() {
        return ref;
    }

    public void setRef(List<String> ref) {
        this.ref = ref;
    }

    public Produit(String name, BigDecimal price) {
        this.name = name;
        this.price = price;

    }

    private String name;
    private BigDecimal price;

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
