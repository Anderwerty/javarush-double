package ua.javarush.module1.lesson16;

public class Example7 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add(null);

        myArrayList.printInfo();
    }
}

class MyArrayList {
    private static final int DEFAULT_CAPACITY = 3;
    private String[] items;
    private int size = 0;

    public MyArrayList() {
        items = new String[DEFAULT_CAPACITY];
    }


    public void add(String item) {
        if (items.length == size) {
            String[] newItems = new String[items.length * 2];
            copy(newItems, items);
            items = newItems;
        }
        items[size++] = item;
    }

    private void copy(String[] destinationItems, String[] sourceItems) {
        copy(destinationItems, sourceItems, 0);
    }

    private void copy(String[] destinationItems, String[] sourceItems, int delta) {
        for (int i = 0; i < sourceItems.length; i++) {
            destinationItems[i + delta] = sourceItems[i];
        }
    }


    public void printInfo() {
//        for(String item:items){
//            System.out.println(item);
//        }

        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }
}