import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StudentFileHandling {
    public static void main(String[] args) {
        String fileName = "StudentRecords.txt";

        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Student ID: 101\n");
                writer.write("Student Name: Ramashanmugi\n");
                writer.write("Course: CSE AI & ML\n");
                writer.write("Marks: 95\n");
            }

            System.out.println("Student information written successfully.");

            System.out.println("\nStudent Records:");

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }
    }
}