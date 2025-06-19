//Exception Handling

public class Prac1 {
    public static void main(String[] args) {
        int i=0;
        try{
            System.out.println(8/i);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
        

        System.out.println("Done");
    }
}
