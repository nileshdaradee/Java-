
class A
{
    A()
    {
        super();
        System.out.println("Constructor Of A");
    }

    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}


class B extends A
{
    public B()
    {
        super(3);
        System.out.println("Constructor Of B");
    }

    public B(int n)
    {
        this();
        System.out.println("In B int");
    }
}


public class C {

    public static void main(String args[])
    {
        B b=new B(3);
    }
}

//super method inside the constructor
//every constructor will have the super method
//Every class in java extends the object class in java
//this method will execute the constructor of same class
//camel casing 
//variable and method=cal();
//class and Interface=Class{};
//constants=PIE
