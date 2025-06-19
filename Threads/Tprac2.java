import A;
import B;

package Threads;
class A implements Runnable 
{
    public void run()
    {
        System.out.println("hello");
    }
}

class B implements Runnable
{
     public void run()
    {
        System.out.println("nilesh");
    }
}

public class Tprac2 {
    public static void main(String[] args) {
        A obj1=new A(){
            
        };
        B obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

    }
}
