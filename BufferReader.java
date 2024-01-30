package Java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are " + age + " years old.");

        reader.close();
    }
}
