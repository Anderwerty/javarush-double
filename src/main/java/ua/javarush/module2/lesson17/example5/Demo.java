package ua.javarush.module2.lesson17.example5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ua.javarush.module2.lesson17.example5.TestStatus.PASSED;

public class Demo {
    public static void main(String[] args) {
        new TestRunner().runTestFor(MyTest.class, ATest.class);
    }
}

//**
// 1. add beforeMethod and beforeAllMethods
// 2. assertion
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

enum TestStatus {
    PASSED, FAILD;
}

class CalculatorTest {
    Calculator calculator = new Calculator();

    public TestStatus testAddMethod() {
        int actualResult = calculator.add(1, 2);
        int expected = 3;
        return actualResult == expected ? PASSED : TestStatus.FAILD;
    }
}

class TestRunner {
    public void runTestFor(Class<?>... classes) {
        Arrays.stream(classes).forEach(this::runTestForTestClass);
    }

    private void runTestForTestClass(Class<?> aClass) {
        try {
            // test class has just default constructor
            Object testClassObject = aClass.getConstructor().newInstance();

            // test methods are public and without parameters and name starts with "test"
            Method[] methods = aClass.getMethods();
            List<Method> testMethods = new ArrayList<>();
            List<Method> beforeAllMethods = new ArrayList<>();
            List<Method> beforeMethodMethods = new ArrayList<>();
            for (Method method : methods) {
                if (method.getName().startsWith("test")) {
                    testMethods.add(method);
                } else if (method.getName().startsWith("beforeAll")) {
                    beforeAllMethods.add(method);
                } else if (method.getName().startsWith("beforeMethod")) {
                    beforeMethodMethods.add(method);
                }
            }

            // invoke before all methods
            beforeAllMethods.forEach(method -> invokeMethod(method, testClassObject));

            // invoke test method
            testMethods.forEach(method -> {
                System.out.println("=============================");
                System.out.println("***** Test: " + method.getName());
                beforeMethodMethods.forEach(bm -> invokeMethod(bm, testClassObject));
                invokeMethod(method, testClassObject);
                System.out.println("=============================");
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void invokeMethod(Method method, Object testClassObject) {
        try {
            method.invoke(testClassObject);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class MyTest {

    public MyTest() {

    }

    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    public void test100() {
        System.out.println("test100");
    }

    public void beforeMethod1() {
        System.out.println("before test method");
    }

    public void beforeAll1() {
        System.out.println("before all test methods");
    }
}

class ATest {
    public ATest() {

    }

    public void testValue() {
        System.out.println("test value");
    }
}
