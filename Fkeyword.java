//Final Keyword
//used with variable , method, class
//cant change the value of the final variable
//final class cannot be extended by any class
//if method made final no one can override it

 class A{
    public final void show()
    {
        System.out.println("  Class A show");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

// class B extends A{
//---ERROR
// }

class B extends A
{
     public void show()
    {
        System.out.println("  Class A show");
    }
}

public class Fkeyword {
    public static void main(String[] args) {
        final int num=7;
        //num=3; -- giving error
        // System.out.println(num);

        A obj=new A();
        obj.show();
        obj.add(2, 4);

        B obj1=new B();
        obj1.add(3, 3);

        
    }
}
