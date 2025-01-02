package org.example.openModuleContent;

import org.example.ssss.A;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        A a=new A();
       // B b=new B();
        //ssss.AA aa=new AA();
        Class c= Class.forName("org.example.ssss.B");
        Field[] fields= c.getFields();
        System.out.println(Arrays.stream(fields).toList());
        System.out.println("hello");
    }
}
