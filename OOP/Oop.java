package OOP;
class Calculator{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
}

public class Oop {
    public static void main(String args[])
    {
        System.out.println("hello");

        Calculator cal=new Calculator();
        int result=cal.add(2,3);
        System.out.println(result);
    }
}
