package Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//stram API
import java.util.stream.Stream;


public class StrmApi {
    public static void main(String[] args) {
        
        List<Integer>arr=Arrays.asList(3,4,2,21,1);

        // System.out.println(arr);

        // arr.forEach(n->System.out.println(n));

        // Stream.

        Consumer<Integer> cons=(n)->System.out.println(n); 
        
        arr.forEach(cons);

        Stream<Integer> s1=arr.stream();
        //performing operation on the data without changing the actual data
        //can use stream only once
        
        // Stream s2=s1.filter(n->n%2==0);
        Stream <Integer>s2=s1.filter(n->n%2==0);
        Stream <Integer>s3=s2.map(n->n*2);

        int r=s3.reduce(0,(c,e)->c+e);
        System.out.println(r);

        // s2.forEach(n->System.out.println(n));

        int result=arr.stream().filter(n->n%2==0).
                        map(n->n*2).reduce(0, (a,b)->a+b);

        Stream<Integer> sortedValue=arr.stream()
                                        .filter(n->n%2==0)
                                        .sorted();

        sortedValue.forEach(n->System.out.println(n));

        //use parllel stream when u want to filter not during sorting
    }
}
