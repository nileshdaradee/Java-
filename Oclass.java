//object class in java


class A{
int price;
String brand;

public String toString()
{
    return "HEllo";
}

public boolean equals(A that)
{
    return this.brand.equals(that.brand) &&
    this.price==that.price;
}
}

public class Oclass {
    
    public static void main(String[] args) {
        
        A obj=new A();
        obj.brand="DELL";
        obj.price=100000;

        A obj1=new A();
        obj1.brand="DELL";
        obj1.price=100000;


        System.out.println(obj);
        System.out.println(obj.equals(obj1));
    }
}
