package OOP;
//interface 
//all methods are abstract and public
//cannot create the object of the interface
//all the variables inside the interface are by default 
//static and final

interface A{
    int age=34;
    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X{
    
}

class B implements A,X
{
    public void show(){
        System.out.println(" In B show");
    }
    public void config(){
        System.out.println("in config show");
    }

    public void run()
    {
        System.out.println("Running");
    }
}


public class Intface {
    public static void main(String[] args) {
        System.out.println(A.age);
    }
}
