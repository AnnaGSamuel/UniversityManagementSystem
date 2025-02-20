package University;

import java.io.*;

public class ReportGenerator {
    public static void saveToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }
    public static void readFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}