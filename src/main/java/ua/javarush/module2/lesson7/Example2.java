package ua.javarush.module2.lesson7;

public class Example2 {
    public static void main(String[] args) {
        String product = null;
        String productType = getProductType(product);
        System.out.println(productType);
    }

    private static String getProductType(String product) {
       return switch (product) {
//           case null ->" ";
            case "Apple","Peach" -> {
                System.out.println("");
                yield "Fruit";
            }
            case "Raspberry"-> "Berry";
            default -> "other";
        };
    }
}

