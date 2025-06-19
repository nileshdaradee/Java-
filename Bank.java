//Encapsulation


class Account
{
    private int accno;
    private String email;
    private String Name;
    private float balance;
    public static String branchname="State Bank Of India";


    public void setAccountNo(int num)
    {
        this.accno=num;
    }
    
    public int getAccountNo()
    {
        return this.accno;
    }
    
    public void setAccountemail(String email)
    {
        this.email=email;
    }
    
    public String getAccountemail()
    {
        return this.email;
    }
    
   public void setAccountname(String name)
    {
        this.Name=name;
    }
    
    public String getAccountname()
    {
        return this.Name;
    }


    public void setAccountbalance(float amount)
    {
        this.balance=amount;
    }
    
    public float getAccountbalance()
    {
        return this.balance;
    }
}



public class Bank {
    public static void main(String args[])
    {
        Account acc1=new Account();
       System.out.println(Account.branchname);
       acc1.setAccountNo(231);
       acc1.setAccountemail("nilesh@gmail.com");
       acc1.setAccountname("Nilesh");
       acc1.setAccountbalance(500);


       System.out.println(acc1.getAccountNo());
       System.out.println(acc1.getAccountname());
       System.out.println(acc1.getAccountemail());
       System.out.println(acc1.getAccountbalance());



       Account acc2=new Account();
       System.out.println(Account.branchname);

    }
}
