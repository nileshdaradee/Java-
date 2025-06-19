class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand+price +name);
    }
}
//common variable used by all the objects
//one change affects all the objects
//called with classname

public class Statics {
    public static void main(String args[])
    {
        Constructors obj=new Constructors();
        obj.price=100;
        obj.brand="oppo";
        obj.name="Phone";

        Constructors obj1=new Constructors();
        obj1.price=200;
        obj1.brand="vivo";
        obj1.name="SmartPhone";

        obj1.show();
        obj.show();

        System.out.println(Constructors.name);

        
    }
}
