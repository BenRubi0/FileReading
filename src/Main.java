// Made by Benjamin Rubio
// For Mr. Gross Software and Programming Dev 2 Class
// Contact at benjamin.rubio@malad.us

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner fileScanner; // creates the public fileScanner variable

    // create the readFile method to easily read the contents of a file
    public static void readFile(String path) throws IOException {
        File fileToRead = new File(path); // creates the file object for the file we're going to read
        fileScanner = new Scanner(fileToRead); // creates the scanner object we're going to use to read the file

        fileScanner.useDelimiter("\\Z"); // uses a delimiter to separate the file data
        System.out.println(fileScanner.next()); // shows the user the contents of the next line
    }

    public static void main(String[] args) {
        String fileToReadPath = "student.txt"; // store the path of the file we want to read

        System.out.println("\nRead contents: \n"); // tells the user what content it read from the file

        // try-catch statement since the readFile method throws an IOExeption
        try {
            readFile(fileToReadPath); // reads the file
        } catch (IOException e) {
            System.out.println(e.getMessage()); // tells the user what went wrong during the attempt to read the file
        }

        fileScanner.close(); // close the reading stream
    }
}