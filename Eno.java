
enum Laptop
{

    Running(200),Failed(400),Pending(204),Success(201);

    private int price;

    private Laptop(int n)//it should be private because we are creating the object in the same class 
    {
        this.price=n;
    }

    public int show()
    {
        return this.price;
    }

}

public class Eno {
    public static void main(String[] args) {
        int i=3;
        // Status s=Status.Running;
        // System.out.println(s.ordinal());
        Laptop lap=Laptop.Pending;
        int r=lap.show();

        System.out.println(r);
    }
}
