package main.java.springframework;

public class BeansException extends Exception {

    public BeansException(String message,Exception e) {
        super(message, e);
    }

    public BeansException(String message) {
        super(message);
    }
}
