package ua.javarush.module2.lesson8;

public class Example5 {
    public static void main(String[] args) {

    }
}

class UserService {
    private static int value;

    static {
        value = 100;
    }

    private static int value2 = wrapperInitValue();

    private static int initValue() throws Exception {
        System.out.println("some logic");
        return 0;
    }

    private static int wrapperInitValue()  {
       try {
           return initValue();
       } catch ( Exception e){
//           return 0;
           throw new RuntimeException(e);
       }
    }

}
