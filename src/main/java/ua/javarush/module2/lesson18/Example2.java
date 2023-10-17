package ua.javarush.module2.lesson18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@MyAnnotation2
public class Example2 {

    @MyAnnotation2
    private int value;
    @MyAnnotation2
    public static void main(String[] args) {

    }
}


@Target(value = {ElementType.METHOD, ElementType.FIELD})
@interface MyAnnotation2 {

}

@Target(value = ElementType.METHOD)
@interface MyAnnotation3 {

}

@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@interface MyAnnotation4 {

}
