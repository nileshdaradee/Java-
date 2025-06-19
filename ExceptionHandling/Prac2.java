public class Prac2 {
    public static void main(String[] args) {
        int i=0;
        int arr[]=new int[4];
        try{

            System.out.println(arr[7]);
            System.out.println(8/i);
            
        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        

        System.out.println("Done");
    
    }
}
