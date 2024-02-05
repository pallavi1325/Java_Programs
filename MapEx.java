package Java;
import java.util.*;

public class MapEx {

    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(101,"A");
        m.put(102, "B");
        System.out.println(m);
        System.out.println("Entry:"+m.entrySet());
        System.out.println("Key:"+m.keySet());
        System.out.println("Values:"+m.values());
    }

}
