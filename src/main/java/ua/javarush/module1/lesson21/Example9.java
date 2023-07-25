package ua.javarush.module1.lesson21;

public class Example9 {
    public static void main(String[] args) {
        try {
            method(10);
        } catch (AException|BException e) {
            e.printStackTrace();
        } catch (CException e){
            System.out.println("...............");
        }
    }


    private static void method(int value) throws AException, BException, CException {
        if(value == 0) {
            throw new AException();
        }

        if(value == 1){
            throw new BException();
        }

        if(value ==2){
            throw new CException();
        }
    }
}

class AException extends Exception {

}

class BException extends Exception {

}

class CException extends Exception {
}