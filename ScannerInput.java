package Java;
import java.util.*;
public class ScannerInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next();
        System.out.println("Enter Your Roll No.:");
        int rollno = sc.nextInt();
        System.out.println("Enter Your Percentage:");
        float percentage = sc.nextFloat();
        System.out.println("Your name is:" + name);
        System.out.println("Your Roll No. is:" + rollno);
        System.out.println("Your Percentage are:" + percentage);
    }
}
