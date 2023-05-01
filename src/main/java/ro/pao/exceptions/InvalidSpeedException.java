package ro.pao.exceptions;

// Requirement 2
public class InvalidSpeedException extends RuntimeException {

    public InvalidSpeedException() {
        super("Speed cannot be negative!");
    }

}
