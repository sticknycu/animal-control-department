package ro.pao.exceptions;

// Requirement 2
public class InvalidAnimalException extends RuntimeException {
    public InvalidAnimalException() {
        super("Animal not found!");
    }

}
