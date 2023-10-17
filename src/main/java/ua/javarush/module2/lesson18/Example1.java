package ua.javarush.module2.lesson18;

@MyAnnotation
public class Example1 {

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
        System.out.println("Example1");
    }
}

@interface MyAnnotation {

}
