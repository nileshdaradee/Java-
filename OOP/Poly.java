package OOP;

//POlymorphism
//Compile time polymorphism and Run time poolymorphism
//compile time=Overloading
//Runtime=Overriding

import A;
import B;

class A
{
    public void show()
    {
        System.out.println("  Class A show");
    }
}


class B extends A
{
     public void show()
    {
        System.out.println("  Class B show");
    }
}


class C extends A
{
     public void show()
    {
        System.out.println("  Class C show");
    }
}
public class Poly {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

         obj=new B();
         obj.show();

         obj=new C();
         obj.show();


    }
}
