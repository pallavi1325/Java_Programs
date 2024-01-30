import java.util.*;
import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Pallavi\\IdeaProjects\\Java_Examples\\src\\Java\\File_Reader.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
