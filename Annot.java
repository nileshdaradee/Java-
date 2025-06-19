
//Annotation

import Threads.A;
import Threads.B;

class A 
{
    public void showTheDataBelongs()
    {
        System.out.println("In A Show");
    }
}

class B extends A{

    @Override
    public void showTheDataBelongs()
    {
        System.out.println("In B Show");
    }
}

public class Annot {
    public static void main(String[] args) {
        
        B obj=new B();
        obj.showTheDataBelongs();
    }
}
