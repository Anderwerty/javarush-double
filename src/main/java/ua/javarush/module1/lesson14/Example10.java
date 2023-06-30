package ua.javarush.module1.lesson14;

public class Example10 {
    public static void main(String[] args) {
//        new OuterClass.NestedClass();
//        new OuterClass.NestedClass();

        OuterClass outerClass = new OuterClass();
        outerClass.new InnerClass();
        outerClass.new InnerClass();
    }
}

class OuterClass {

    public static final int OUTER_CONSTANT;

    static {
        OUTER_CONSTANT =100;
        System.out.println("Static block OuterClass -1");
    }

    static {
        System.out.println("Static block OuterClass -2");
    }

    {
        System.out.println("Nonstatic block OuterClass");
    }

    public OuterClass() {
        System.out.println("OuterClass constructor");
    }

    public static class NestedClass {

        static {
            System.out.println("Static block NestedClass");
            System.out.println(OUTER_CONSTANT);
        }

        {
            System.out.println("Nonstatic block NestedClass");
        }

        public NestedClass() {
            System.out.println("NestedClass constructor");
        }
    }

    public  class InnerClass {

//        static {
//            System.out.println("Static block InnerClass");
//            System.out.println(OUTER_CONSTANT);
//        }

        {
            System.out.println("Nonstatic block InnerClass");
        }

        public InnerClass() {
            System.out.println("InnerClass constructor");
        }
    }


}
