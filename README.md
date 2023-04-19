# animal-control-department

You are tasked with developing a system for a city's Animal Control Department. The department monitors animal sightings in the city and responds to animal-related incidents. The system you will develop must meet the following requirements:

1. Implement sealed classes Mammal, Bird, and Reptile for animal types, each with a speed() method.
2. Create custom exceptions: InvalidAnimalException, InvalidSpeedException, and InvalidDateException.
3. Use java.util.logging for logging various stages of operation: [Logging Guide](https://docs.oracle.com/javase/7/docs/technotes/guides/logging/overview.html).
4. Read/write animal sightings data from sightings.txt and processed_sightings.txt using java.nio.Files and java.nio.Path.
5. Use OpenCSV to read/write animal incident reports from incidents.csv and processed_incidents.csv: [OpenCSV Guide](https://opencsv.sourceforge.net/)
6. Use HttpClient to fetch data from a REST API providing endangered species data: [HttpClient Guide](https://www.baeldung.com/java-9-http-client)
7. Deserialize JSON data into Java objects with Jackson ObjectMapper: [Jackson Guide](https://www.baeldung.com/jackson-object-mapper-tutorial)
8. Write JUnit tests for classes (AnimalTest, AnimalControlSystemTest): [JUnit 5 Guide](https://junit.org/junit5/docs/current/user-guide/) si [aici](https://www.baeldung.com/junit-5)
9. Create an AnimalSighting class with properties: location, date, and animal type.
10. Store/retrieve animal images using FileInputStream and FileOutputStream: [aici](https://www.baeldung.com/java-write-to-file) si [aici](https://www.baeldung.com/reading-file-in-java)
11. Filter animal sightings by date, location, or animal type.
12. Implement a non-sealed class hierarchy for animal behaviors: Carnivore, Herbivore, Omnivore.
13. Calculate food consumption for each animal type based on their behavior.
14. Use Species class with Jackson ObjectMapper to map JSON data from the endangered species API.
15. Fetch weather data from a weather API using HttpClient: [API Example](https://openweathermap.org/api)
16. Analyze correlations between weather conditions and animal sightings.
17. Use File and Files classes to create backups of animal sighting and incident data.
18. Implement AnimalHandler abstract class with subclasses: MammalHandler, BirdHandler, and ReptileHandler.
19. Create a simple command-line interface for staff interaction.

*For txt and csv examples read txt-example and csv-example.*

## Exercises

##### Easy:

<b>1. ArithmeticTest.java</b>

**Goal**: Write a JUnit test case for Arithmetic.java (addition, subtraction, multiplication, division).

**Instructions:**

a. Create a class Arithmetic with methods: add, subtract, multiply, divide.

b. Implement a JUnit test class ArithmeticTest to test the Arithmetic class methods with various inputs.


<b>2. InvalidAgeException.java</b>

**Goal**: Create a custom exception for age < 18 with an appropriate message.

**Instructions:**

a. Create a custom exception class InvalidAgeException that extends Exception.

b. Implement a constructor with a custom message.

c. Demonstrate the use of this custom exception in another class.


<b>3. SimpleLogger.java</b>

**Goal**: Implement java.util.logging to log messages (INFO, WARNING, SEVERE).

**Instructions:**

a. Create a class SimpleLogger.

b. Configure and use a java.util.logging.Logger instance to log messages with different log levels.


<b>4. Shape.java</b>

**Goal**: Create a sealed class hierarchy (Circle, Rectangle, Triangle) with a method to calculate the area.

**Instructions:**

a. Create a sealed class Shape with an abstract method area().

b. Implement subclasses Circle, Rectangle, and Triangle, each with their own area() method.

#### Medium:

<b>5. ApiFetcher.java</b>

**Goal**: Use HttpClient to fetch data from https://jsonplaceholder.typicode.com/todos/1 and print the JSON response.

**Instructions:**

a. Create a class ApiFetcher.

b. Use HttpClient to send a GET request and fetch data.

c. Print the JSON response as a string.


<b>6. JsonConverter.java</b>

**Goal**: Deserialize a JSON string to a Java object and serialize it back using the Jackson ObjectMapper.

**Instructions:**

a. Create a class JsonConverter.

b. Define a simple Java object to represent the JSON data.

c. Deserialize a JSON string to a Java object using Jackson ObjectMapper.

d. Serialize the Java object back to a JSON string.


<b>7. TextFileIO.java</b>

**Goal**: Read and write data from/to input.txt and output.txt using java.nio package's Files and Path classes.

**Instructions:**

a. Create a class TextFileIO.

b. Read data from input.txt using Files and Path.

c. Process the data (e.g., reverse lines, sort lines).

d. Write the processed data to output.txt.

<b>8. CsvFileManipulator.java</b>

**Goal**: Read data from input.csv, manipulate it, and write to output.csv using FileInputStream and FileOutputStream.

**Instructions:**

a. Create a class CsvFileManipulator.

b. Read CSV data from input.csv using FileInputStream.

c. Manipulate the data (e.g., filter rows, sort rows, change column values).

d. Write the manipulated data to output.csv using FileOutputStream.

#### Hard:

<b>9. ArithmeticTestSuite.java</b>

**Goal**: Write a JUnit test suite with multiple test cases and use @Before, @After, @BeforeEach, and @AfterEach annotations.

**Instructions:**

a. Create a JUnit test suite class ArithmeticTestSuite.

b. Write multiple test cases for the Arithmetic class.

c. Use annotations to set up and tear down resources before/after tests and test cases.

<b>10. CustomExceptionDemo.java</b>

**Goal**: Demonstrate the use of multiple custom exceptions with try-catch, try-with-resources, and finally blocks.

**Instructions:**

a. Create a class CustomExceptionDemo.

b. Define multiple custom exceptions (e.g., InvalidInputException, DataProcessingException).

c. Use try-catch blocks to handle exceptions and try-with-resources to manage resources (e.g., file streams).

d. Implement finally blocks to ensure proper resource cleanup.

<b>11. AdvancedLogger.java</b>

**Goal**: Configure Log4j or SLF4J with appenders and log levels.

**Instructions:**

a. Create a class AdvancedLogger.

b. Configure Log4j or SLF4J with different appenders (e.g., console, file) and log levels.

c. Log messages with various log levels to demonstrate configuration.

<b>12. Zoo.java</b>

**Goal**: Implement a non-sealed class hierarchy (abstract classes, interfaces, sealed classes) modeling a zoo with animal types and behaviors.

**Instructions:**

a. Create an abstract class Animal with common properties and methods.

b. Implement subclasses for different animal types (e.g., Lion, Toucan, Python).

c. Create interfaces to represent animal behaviors (e.g., Swimmer, Climber, Flyer).

d. Use sealed classes to represent specific animal groups (e.g., BigCat).

<b>13. ApiDataProcessor.java</b>

**Goal**: Fetch data from a REST API using HttpClient, process the JSON data, and deserialize it into Java objects using Jackson ObjectMapper.

**Instructions:**

a. Create a class ApiDataProcessor.

b. Fetch JSON data from a REST API using HttpClient.

c. Process the JSON data (e.g., filter, sort, transform).

d. Deserialize the processed JSON data into Java objects using Jackson ObjectMapper.

<b>14. ComplexJsonConverter.java</b>

**Goal**: Map JSON data to Java objects with complex hierarchies using Jackson ObjectMapper (dates, enums, collections).

**Instructions:**

a. Create a class ComplexJsonConverter.

b. Define Java objects with complex hierarchies (e.g., nested objects, enums, dates, collections).

c. Use Jackson ObjectMapper to deserialize JSON data into these Java objects.

d. Serialize the Java objects back to JSON data.

<b>15. AdvancedFileIO.java</b>

**Goal**: Perform file operations (copy, move, delete) using java.nio package's Files and Path classes, handle IOExceptions.

**Instructions:**

a. Create a class AdvancedFileIO.

b. Use Files and Path classes to perform file operations (e.g., copy, move, delete).

c. Handle IOExceptions that might occur during file operations.

<b>16. OpenCsvProcessor.java</b>

**Goal**: Read and write data from/to input.csv and output.csv using the OpenCSV library, handle different CSV formats and errors.

**Instructions:**

a. Create a class OpenCsvProcessor.

b. Use OpenCSV library to read data from input.csv.

c. Process the CSV data (e.g., filter rows, sort rows, change column values).

d. Write the processed data to output.csv using OpenCSV library.
e. Handle different CSV formats and errors (e.g., invalid CSV data, missing columns).

<b> 17. ApiIntegrationTest.java</b>

**Goal**: Write JUnit tests to test API integration, mock external dependencies using Mockito or another mocking library.

**Instructions:**

a. Create a class ApiIntegrationTest.

b. Write JUnit tests for classes that interact with external APIs (e.g., ApiFetcher, ApiDataProcessor).

c. Use Mockito or another mocking library to mock external dependencies (e.g., HttpClient, HttpResponse).

<b>18. ExceptionHandlingDemo.java</b>

**Goal**: Demonstrate exception handling best practices, such as using specific exceptions, rethrowing exceptions, and wrapping exceptions.

**Instructions:**

a. Create a class ExceptionHandlingDemo.

b. Implement methods that throw and handle exceptions.

c. Demonstrate best practices, such as using specific exceptions, rethrowing exceptions with additional context, and wrapping exceptions.

<b>19. FileComparison.java</b>

**Goal**: Compare the contents of two text files (e.g., file1.txt, file2.txt) using java.nio package's Files and Path classes.

**Instructions:**

a. Create a class FileComparison.

b. Use Files and Path classes to read the contents of file1.txt and file2.txt.

c. Implement a method to compare the contents of the two files and return a boolean result (true if contents are the same, false otherwise).

<b>20. CsvDataAnalysis.java</b>

**Goal**: Perform data analysis on a CSV file using the OpenCSV library, such as calculating averages, sums, and generating statistics.

**Instructions:**

a. Create a class CsvDataAnalysis.

b. Read data from a CSV file (e.g., data.csv) using the OpenCSV library.

c. Implement methods to perform data analysis (e.g., calculating averages, sums, generating statistics).

d. Display the results of the data analysis.