package crud;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Crud {

    public static void main(String[] args) {
    	
        String fileName = "example.txt";

      createFile(fileName);

        
        readFile(fileName);

        
        updateFile(fileName, "This is the updated content.");

        
        readFile(fileName);

       
        deleteFile(fileName);
    }

    private static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading from file:");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\n" + content);
            System.out.println("File updated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + fileName);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}


