package ro.pao.exceptions;

// Requirement 2
public class InvalidDateException extends RuntimeException{

    public InvalidDateException() {
        super("Please enter a day from the past!");
    }

}
