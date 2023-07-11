package ua.javarush.module1.lesson17;

import java.util.Iterator;

public class Example7 {
    public static void main(String[] args) {
        CatAndDog catAndDog = new CatAndDog("Kot", "Pes");

        for (String s : catAndDog) {
            System.out.println(s);
        }

        System.out.println("--------------------");
        for (String s : catAndDog) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        Iterator<String> iterator = catAndDog.iterator();

        String s;
        for (; iterator.hasNext(); ) {
            s = iterator.next();
            System.out.println(s);
        }
    }
}

class CatAndDog implements Iterable<String> {
    private final String catName;
    private final String dogName;

    CatAndDog(String catName, String dogName) {
        this.catName = catName;
        this.dogName = dogName;
    }


    //    @Override
    public Iterator<String> iterator() {

        return new CatAndDogNamesIterator();
    }

    class CatAndDogNamesIterator implements Iterator<String> {
        private final String[] names = new String[2];

        {
            names[0] = catName;
            names[1] = dogName;
        }

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < 2;
        }

        @Override
        public String next() {
            return names[currentIndex++];
        }
    }
}


