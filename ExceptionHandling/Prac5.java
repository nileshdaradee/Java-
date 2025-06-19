//throws keyword

import OOP.A;

class A {
    void c() throws Exception
    {
        System.out.println(34/0);
    }

    void d() throws Exception
    {
        System.out.println(3/0);
    }

    void e()
    {
        try{
            c();
            d();

        }

        catch(Exception e)
        {
            System.out.println("Eror"+e);
        }
    }
    
}


public class Prac5 {
    public static void main(String[] args) {
        A obj=new A();
        obj.e();
    }
}
