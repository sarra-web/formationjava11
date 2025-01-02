package org.example.interfaces;


// Genenrics are available since JAVA SE 5

// without generics:
// example of java interface is Comparable compare the currente object(this) to other
// Comparator : compare a pair of objects
/**
 Cloneable is an example of an interface used as a "type-marker" or "tag-interface."
 The interface does not have to define any methods.
 It can still be used with the instanceof operator to validate the object type.
 Cloning an object means creating a replica of the objects memory.
 The java.lang.Cloneable interface indicates a permission that an object can be cloned.
 * */
import Formation_Cert_javaSE11.part2.Factory.Product;

interface Comparator<T>{

    int compare(T o1,T o2);


}
 class ProductNameSorter implements Comparator<Product>{


     @Override
     public int compare(Product o1, Product o2) {
         return 0;
     }
 }

 class Some{
    private Object value;

    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value=value;
    }
}

// with generics:
class Some2<T>{
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value=value;
    }
}

public interface Generics {
public static void main(String[] args){
Some2<String> a;

    System.out.println("Gnerics");
}

}
