package Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age,String n)
    {
        this.age=age;
        this.name=n;
    }

    public String toString()
    {
        return "Student [age="+age+ ",name="+name+"]";
    }
}

public class Collsort {
    public static void main(String[] args) {
        Comparator<Integer> comp=new Comparator<Integer>() {
            public int compare(Integer a,Integer b)
            {
                if(a%10>b%10)
                {
                    return 1;
                }
                else{
                    return -1;
                }
            }
            
        };

        Comparator<Student>compr=(a,b)->a.age>b.age?1:-1;
        
        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(43);
        arr.add(33);
        arr.add(2);
        arr.add(56);
        arr.add(9);

        Collections.sort(arr ,comp);
        System.out.println(arr);

        List<Student> stud=new ArrayList<>();
        stud.add(new Student(23, "nil"));
        stud.add(new Student(24, "ram"));
        stud.add(new Student(25, "john"));
        stud.add(new Student(26, "raja"));

        

        Collections.sort(stud,compr);

        System.out.println(stud);


    }
}
