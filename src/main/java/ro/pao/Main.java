package ro.pao;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import ro.pao.application.Menu;
import ro.pao.gateways.Requests;
import ro.pao.model.AgeExceptionTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Menu menu = Menu.getInstance();

            menu.animalException("abc");

            menu.speedException(-13.d);

            menu.dateException(LocalDate.of(2024, 1, 1));

            // Requirement 4

            // Using File

            File file = new File("sightings.txt");

            try {

                String sightings = Files.readString(file.toPath());
                System.out.println("Content of file:\n" + sightings);

            } catch (IOException e) {

                System.out.println("File not found!");

            }

            System.out.println("---------------------------------------------------\n");

            // Usign Path

            Path filePath = Paths.get("sightings.txt");

            try {

                String sightings = Files.readString(filePath);
                System.out.println("Content of file:\n" + sightings);

            } catch (IOException e) {

                System.out.println("File not found!");

            }

            // Requirement 5

            CSVWriter csvWriter = null;
            try {

                FileReader fileReader = new FileReader("incidents.csv");
                FileWriter fileWriter = new FileWriter("incidents_processed.csv");

                CSVReader csvReader = new CSVReader(fileReader);
                csvWriter = new CSVWriter(fileWriter);

                String[] nextRecord;

                while ((nextRecord = csvReader.readNext()) != null) {

                    for (Integer i = 0; i < nextRecord.length; i++) {

                        if (Objects.equals(nextRecord[i], "Mammal")) {

                            csvWriter.writeNext(nextRecord);

                        }

                    }

                }

            } catch (Exception e) {

                e.printStackTrace();

            } finally {

                csvWriter.close();

            }

            new Requests().saveRequestInfo();

            new AgeExceptionTest().checkAge(17);

            if ("exit".equals(scanner.next())) {
                break;
            }

        }

    }

}
