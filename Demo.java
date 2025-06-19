class Calc {
    
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
    
    
}

 class AdvCalc extends Calc
{
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }

       public int div(int n1,int n2)
    {
        return n1/n2;
    }
}

class Demo
{
    public static void main(String[] args) {
        AdvCalc c1=new AdvCalc();
        System.out.println(c1.add(2,3));
        System.out.println(c1.sub(2,3));
        System.out.println(c1.mul(2,3));

        

    }
}
