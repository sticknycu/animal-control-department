package ro.pao.application;
import lombok.SneakyThrows;
import ro.pao.exceptions.InvalidAnimalException;
import ro.pao.exceptions.InvalidDateException;
import ro.pao.exceptions.InvalidSpeedException;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    private static Logger logger = Logger.getLogger(Menu.class.getName());

    private static Menu INSTANCE;

    public static Menu getInstance() {
        return (INSTANCE == null ? new Menu() : INSTANCE);
    }

    // Requirement 3
    @SneakyThrows
    public void animalException(String animalName) {

        if (animalName.equals("abc")) {
            var exception = new InvalidAnimalException();
            logger.log(Level.SEVERE, exception.getMessage());
        }

        try {

            } catch (InvalidAnimalException e) {
                logger.log(Level.SEVERE, e.getMessage());
            }

    }

    @SneakyThrows
    public void speedException(Double speed) {

        if (speed < 0) {
            var exception = new InvalidSpeedException();
            logger.log(Level.SEVERE, exception.getMessage());
        }

        try {

        } catch (InvalidSpeedException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

    }

    @SneakyThrows
    public void dateException(LocalDate date) {

        if (date.equals(LocalDate.of(2024, 1, 1))) {
            var exception = new InvalidDateException();
            logger.log(Level.WARNING, exception.getMessage());
        }

        try {

        } catch (InvalidAnimalException e) {
            logger.log(Level.WARNING, e.getMessage());
        }

    }

}
