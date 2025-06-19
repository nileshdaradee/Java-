package Map;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollcSet {
    public static void main(String[] args) {
        
        Set <Integer> s=new HashSet<Integer>();
        Set <Integer> s1=new TreeSet<Integer>();
        Iterator<Integer> value=s1.iterator();

        s.add(3);
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(8);

        

        System.out.println(s);

    }
}
