class NileshException extends Exception
{
    public NileshException(String s)
    {
        // System.out.println(s);
        super(s);
        
    }
}



public class Prac4 {
    public static void main(String[] args) {
        int i=30;
        int j=0;
        try{

            j=18/i;

            if(j==0)
            {
                throw new NileshException("Hello");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        

        System.out.println("Done");
    
    }
}
