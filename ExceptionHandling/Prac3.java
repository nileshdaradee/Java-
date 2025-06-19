//Runtime Exception = unchecked Exception
//SQL==Checked Exception
//throwable == parent class of Exception



public class Prac3 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{

            j=18/i;

            if(j==0)
            {
                throw new ArithmeticException("Hello");
            }
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        

        System.out.println("Done");
    
    }
}
