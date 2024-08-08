import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {

        // Read
        File movieFile = new File("movie.txt");
        try {
            Scanner reader = new Scanner(movieFile);
            while (reader.hasNextLine()) {
                System.err.println(reader.nextLine());
            }
            reader.close();
        } catch(FileNotFoundException e) {
            System.err.println("File not found " + e);
            e.printStackTrace();
        }


        // Write
        try {
            FileWriter output = new FileWriter("output.txt");
            // FileWriter("output.txt", true); for append mode
            output.write("Hello World \n");
            output.write("This is my first file written in java.");
            output.close();
        } catch (IOException e) {
            System.err.println("An error ocurred" + e);
            e.printStackTrace();
        }
        
        try {
            File outputFile = new File("output.txt");
            Scanner outputScanner = new Scanner(outputFile);
            while (outputScanner.hasNextLine()) {
                System.err.println(outputScanner.nextLine());
            }
            outputScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
