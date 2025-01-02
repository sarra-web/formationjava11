package org.example.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/***
Annotations in Java
        Annotations in Java are metadata that provide data about a program but do not directly affect the program's operation. They are often used to give instructions to the compiler, runtime, or frameworks.

        Common Uses of Annotations
        Compiler Instructions: Suppressing warnings, marking methods for overrides, etc.
        Runtime Processing: Used by frameworks like Spring or Hibernate for dependency injection and configuration.
        Documentation: Inform tools or developers about the code structure.
        Built-in Annotations

 */

 //       1. @Override
//Indicates that a method overrides a method in its superclass. This prevents accidental mismatches in method names or signatures.

class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void display() { // Overrides the parent method
        System.out.println("Child method");
    }
}
//2. @Deprecated
//Marks a class, method, or field as deprecated and discourages its use. Provides a reason through @deprecated in Javadoc.

@Deprecated
class OldClass {
    void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}
//3. @SuppressWarnings
//Suppresses specific warnings during compilation. Often used with unchecked warnings for generics.
/**
@SuppressWarnings("unchecked")
void useRawTypes() {
        List list = new ArrayList(); // Raw type warning suppressed
        list.add("Example");
        }*/
       // 4. @FunctionalInterface
//Indicates an interface with a single abstract method, suitable for lambda expressions.

@FunctionalInterface
interface Greeting {
    void sayHello();
}
//5. @SafeVarargs
//Indicates that a method does not perform unsafe operations on its varargs parameters. Used with static or final methods.
/**
@SafeVarargs
public static <T> void print(T... args) {
        for (T t : args) {
        System.out.println(t);
        }
        }
   */
/*        Meta-Annotations
        Meta-annotations are used to define other annotations.*/

/**@Retention: Specifies how long the annotation is retained.

        RetentionPolicy.RUNTIME: Available at runtime.
        RetentionPolicy.CLASS: Stored in the class file but not available at runtime.
        RetentionPolicy.SOURCE: Discarded by the compiler.*/

@Retention(RetentionPolicy.RUNTIME)
 @interface YAnnotation {}


/**@Target: Specifies where the annotation can be applied.

        ElementType.METHOD: Can annotate methods.
        ElementType.FIELD: Can annotate fields.
        ElementType.TYPE: Can annotate classes, interfaces, or enums.*/

@Target({ElementType.METHOD, ElementType.FIELD})
 @interface MAnnotation {}
//@Documented: Includes the annotation in the Javadoc.


@Documented
 @interface MyAnnotation1 {}
//@Inherited: Allows the annotation to be inherited by subclasses.

@Inherited
@Retention(RetentionPolicy.RUNTIME)
 @interface MyAnnotation2 {}
//@Repeatable: Allows multiple annotations of the same type.

@Repeatable(Labels.class)
 @interface Label {
    String value();
}

 @interface Labels {
    Label[] value();
}

@Label("A")
@Label("B")
class Example {

    @Info(author = "sss", date = "")
    public void displayInfo(){
        
    }
}
 /*   Custom Annotations
    You can define your annotations by creating an interface prefixed with @ and optionally using meta-annotations.
*/
/**
    Accessing Annotations Using Reflection
    Annotations can be accessed at runtime using reflection if their retention policy is RUNTIME.
*/

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method method = Example.class.getMethod("displayInfo");

        if (method.isAnnotationPresent(Info.class)) {
            Info info = method.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
            System.out.println("Version: " + info.version());
        }
    }
}
 /**   Annotations in Frameworks
        Spring: Annotations like @Component, @Autowired, and @RestController simplify dependency injection and configuration.
        JPA (Hibernate): Annotations like @Entity, @Table, @Column, and @Id are used for ORM mapping.
        JUnit: Annotations like @Test, @BeforeEach, and @AfterEach help in creating and managing unit tests.
        Key Points
        Annotations Simplify Development: They reduce boilerplate code by leveraging frameworks and tools.
        Retention Matters: RUNTIME annotations are for runtime processing, CLASS for compiler tools, and SOURCE for code analysis tools.
        Use Meta-Annotations: Define annotations with specific scopes and purposes using meta-annotations.
        Reflection for Custom Annotations: Retrieve annotation details at runtime when needed.
        Annotations play a critical role in modern Java development, especially with frameworks like Spring and Hibernate. Familiarity with common and custom annotations is essential for effective programming.
*/