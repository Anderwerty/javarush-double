package ua.javarush.module2.lesson15;

public class Example2 {
    public static void main(String[] args) {
        OurClass2.NestedClass nestedClass = new OurClass2.NestedClass();
    }
}

class OurClass2 {

    private static final int CONSTANT_INT = 10;
    private static int staticInt;

    private int value;

    private void nonStaticMethod() {
        System.out.println(NestedClass.NESTED_CONSTANT);
    }

    private static void staticMethod() {
        System.out.println(NestedClass.NESTED_CONSTANT);
    }

    static class NestedClass {
        private static final int NESTED_CONSTANT = 10;

        private static int staticIntNested;

        private int nestedValue;

        public static void staticMethodNested(){
            System.out.println(staticIntNested);
            System.out.println(CONSTANT_INT);
        }

        public void nonStaticMethodNested(){
            System.out.println(staticIntNested);
            System.out.println(CONSTANT_INT);
            System.out.println(nestedValue);
        }
    }
}
