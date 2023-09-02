package ua.javarush.module2.lesson2.example4;

public class Example4 {
    public static void main(String[] args) {
        A.B b = new C().new B();

        A.D d = new A.D();
    }
}

 abstract class A {

     public class B extends A {}


     public B method(){
         return  new B();
     }

     public static class D extends A{}
}

class C extends A{

}
