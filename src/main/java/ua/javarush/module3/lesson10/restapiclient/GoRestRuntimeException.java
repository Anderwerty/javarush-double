package ua.javarush.module3.lesson10.restapiclient;

public class GoRestRuntimeException extends RuntimeException{
    public GoRestRuntimeException() {
    }

    public GoRestRuntimeException(String message) {
        super(message);
    }

    public GoRestRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GoRestRuntimeException(Throwable cause) {
        super(cause);
    }
}
