package Week5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            String fileName = "C:/Users/Chris/Documants/students.txt";
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
