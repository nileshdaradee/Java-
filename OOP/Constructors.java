package OOP;
class  Mobile {
int price;
static String name;
Mobile(int pr)
{
    price=pr;
}

static
{
    name="akd";
}

public static void show()
{
    System.out.println("static method");
}
    
}

 class Constructors {
    public static void main(String args[])
    {
        Mobile.show();
    }
}


//static blocks get called first
//and called only once
//you can only load your class using Class.forname("Mobile");
//static block is used to initialize static variable
//cannot use non static variable inside the static bock
//from object refernence we can access the non static member of the system
