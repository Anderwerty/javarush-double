package ua.javarush.module1.lesson20;

public class Example6 {
    public static void main(String[] args) {
        int age = 2;

        String message1 = getMessageWithIfs(age);
        System.out.println(message1);

        System.out.println("=".repeat(40));


        String message2 = getMessageWithSwitchCase(age);
        System.out.println(message2);


    }

    private static String getMessageWithSwitchCase(int age) {
//        String message2;
//        switch (age) {
//            case 0:
//                message2 = "age is 0";
//                break;
//            case 1:
//                message2 = "age is 1";
//                break;
//            case 2:
//                message2 = "age is 2";
//                break;
//            default:
//                message2 ="......";
//                break;
//        }
//        return  message2;

        switch (age) {
            case 0:
                return "age is 0";
            case 1:
                return "age is 1";
            case 2:
                return "age is 2";
            default:
                return "......";
        }
    }

    private static String getMessageWithIfs(int age) {
//        String message1;
//        if (age == 0) {
//            message1 = "age is 0";
//        } else if (age == 1) {
//            message1 = "age is 1";
//        } else if (age == 2) {
//            message1 = "age is 2";
//        } else {
//            message1 = "......";
//        }
//        return message1;

        if (age == 0) {
            return "age is 0";
        } else if (age == 1) {
            return "age is 1";
        } else if (age == 2) {
            return "age is 2";
        } else {
            return "......";
        }
    }

}
