package Threads;
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("HEllo");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Nilesh");
        }
    }
}
public class Tprac1 {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        
        // obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
