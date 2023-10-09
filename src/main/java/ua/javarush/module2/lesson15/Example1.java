package ua.javarush.module2.lesson15;

public class Example1 {
    public static void main(String[] args) {
//        OurClass.InnerClass innerClass = new OurClass().new InnerClass();
        OurClass ourClass = new OurClass();
        OurClass.InnerClass innerClass = ourClass.new InnerClass();
    }
}

class OurClass {

    private static final int CONSTANT_INT = 10;
    private static int staticInt;


    private int value;

    private void nonStaticMethod() {
        System.out.println(InnerClass.CONSTANT_INNER_INT);
        System.out.println(CONSTANT_INT);
        System.out.println(staticInt);
//        System.out.println(valueInner);

    }

    private static void staticMethod() {
        System.out.println(InnerClass.CONSTANT_INNER_INT);
        System.out.println(CONSTANT_INT);
//        System.out.println(valueInner);
    }

    class InnerClass {

        private static final int CONSTANT_INNER_INT = 10;

        public int valueInner;

        {

        }

//        static {}


//        private static int staticValue;  // does not work with java 8, it works from java 16

        private void nonStaticMethodInner() {
            System.out.println(CONSTANT_INNER_INT);
            System.out.println(CONSTANT_INT);
            System.out.println(staticInt);
            System.out.println(value);
        }

        // does not work with java 8, it works from java16
//        private static void staticMethodInner() {
//
//        }

    }
}
