package ro.pao.exceptions;

// Exercise 2

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
        super("Age is under 18!");
    }

}
