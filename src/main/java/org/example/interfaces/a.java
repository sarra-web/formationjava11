package org.example.interfaces;



// interface is like an abstract class, except no variable or regular concrete methods are allowed.
//Instance method  are by default public and abstract
//they contan conrete methodes only if theyare either default , or private ,or static.class
//they can contain constants , but ot variales.


//!!!!!!!multiple inheritance is not allawed in java  so interfaces solve this problem
// !!!!!!!a class default method can onl ovveride a default method only if it conflicts with another default method
import java.time.Period;

public interface a {
    public default void prapare(){

    }
    public static final Period MAX_PERIOD=Period.ofDays(3);

        void prepare();
}
interface b {

    public default void prapare(){

    }
    public static final Period MAX_PERIOD=Period.ofDays(3);
    public void prepare();


}
 interface aa extends a {
      void meth();

}
 class c implements a,b{

     @Override
     public void prapare() {
         a.super.prapare();
     }

     @Override
     public void prepare() {

     }
 }

class cc implements aa{


    @Override
    public void prepare() {

    }

    @Override
    public void meth() {

    }

    public static void main(String[] args){

        a interface1 ;
        cc class1 =new cc();
        if(class1 instanceof a){

            System.out.println("yess");
        }
    }


    }

