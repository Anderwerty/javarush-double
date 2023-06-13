package ua.javarush.module1.lesson9;

public class Example9 {
    public static void main(String[] args) {
        int[] items = {1,2,3, 0, -1};

        int max = getMax(items);
        System.out.println(max);
//        System.out.println(getMax(items));

    }

    public static int getMax(int[] items) {
        int max = items[0];
        for (int item: items) {
            if(max<item){
                max = item;
            }
        }
        return max;
    }


}
