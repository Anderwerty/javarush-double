package ua.javarush.module2.lesson5;

public class Example1 {
    public static void main(String[] args) {
        IntContainer intContainer = new IntContainer(1);
        int intValue = intContainer.getValue();


        StringContainer stringContainer = new StringContainer("String");
        String stringValue = stringContainer.getValue();


        Container container = new Container(1);

        Object objectValue = container.getValue();

        if (objectValue instanceof Integer value) {
//            Integer value = (Integer) objectValue;
            System.out.println(value + 1);
        } else if (objectValue instanceof String) {

        }
    }
}

class IntContainer {
    private int value; // int --> Integer

    public IntContainer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class StringContainer {
    private String value;

    public StringContainer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class Container {
    private Object value;

    public Container(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
