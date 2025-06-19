package Map;
import java.util.HashMap;
import java.util.Map;

public class CollMap {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<String,Integer>();

        m.put("a", 2);
        m.put("b", 3);
        m.put("c", 4);
        m.put(null, 5);

        System.out.println(m);

        


    }
}
