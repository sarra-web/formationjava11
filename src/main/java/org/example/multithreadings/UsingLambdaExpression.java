package org.example.multithreadings;

//for small actions

public class UsingLambdaExpression {

    public static void main(String[] args) {
     Runnable th=()->{System.out.println("hello");};
     Thread a=new Thread(th);
     a.start();
   //  a.start();

    }
}
