package OOP;
//Method Overriding

import A;
import B;

class A{
    public void show()
    {
        System.out.println(" in A show");
    }
}

class B extends A{
    
    public void show(int n)
    {
        System.out.println(" in B show");
    }
}




public class MultiInher {
    public static void main(String[] args) {
        
        B obj=new B();
        obj.show(2);

        A obj1=new A();
        obj1.show();

    }
}
