import java.util.HashMap;
import java.util.Map;

public class Maps2MitGenerics {

    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        for (Integer m : map.keySet()) {
            System.out.println(m + " " + map.get(m));
        }
        
    }
}
