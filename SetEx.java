package Java;
import java.util.*;

public class SetEx {

    public static void main(String[] args) {

        Set<String> s=new HashSet<>();
        s.add("Pallavi");
        s.add("Murnmai");
        s.add("Janhavi");
        s.add("Akshada");
        s.add("Nasrin");
        s.add("Praveen");
        System.out.println(s);
        SortedSet<String> s1=new TreeSet<>();
        s1.add("Pallavi");
        s1.add("Murnmai");
        s1.add("Janhavi");
        s1.add("Akshada");
        s1.add("Nasrin");
        s1.add("Praveen");
        System.out.println(s1);


    }

}