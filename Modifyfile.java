import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Modifyfile {

    public static void main(String[] args) {
        // Path to the text file
        String filePath = "D:\\myfirstproject\\src\\Modify.txt"; // Modify this to your file's path

        // Words to find and replace
        String oldWord = "Ganesh"; // Word to be replaced
        String newWord = "Sandeep"; // Word to replace with

        try {
            // Step 1: Read all lines from the file
            List<String> lines=Files.readAllLines(Paths.get(filePath));

            // Step 2: Modify the content of the file by replacing the old word with the new one
            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, lines.get(i).replaceAll(oldWord, newWord)); // Replace each occurrence
            }

            // Step 3: Write the modified content back to the file
            Files.write(Paths.get(filePath), lines);

            System.out.println("File modified successfully!");
        } catch (IOException e) {
            System.out.println("something went wrong"); // Print any IO exceptions (e.g., file not found)
        }
    }
}
