package ro.pao.model;

import org.w3c.dom.ls.LSOutput;
import ro.pao.exceptions.InvalidAgeException;

// Exercise 2

public class AgeExceptionTest {

    public void checkAge(int age) throws InvalidAgeException {

        InvalidAgeException e = new InvalidAgeException();

        try {

            if (age < 18) {
                throw e;
            }

            System.out.println("Age checked!");

        } catch (InvalidAgeException exc) {
            System.out.println("Age under 18!");
        }
    }

}
