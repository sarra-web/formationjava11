package org.example.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info {
    String author();
    String date();
    int version() default 1;
}

public class CustomAnnotationExample {
    @Info(author = "Sarra", date = "2024-12-27", version = 2)
    public void displayInfo() {
        System.out.println("Custom annotation example.");
    }
}




