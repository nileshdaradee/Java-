import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//try can be used with finally without catch

class A
{
    void temp()
    {
        int i=2;

        try{
            System.out.println(8/i);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        finally 
        {//close resources
            System.out.println("FinallyExecuted");
        }
    }
    
}
public class Prac6 {
    public static void main(String[] args) throws IOException {
        
        // int v=System.in.read();

        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);
        // int v=Integer.parseInt(bf.readLine());
        // System.out.println(v);

        // bf.close();

        // Scanner sc=new Scanner(System.in);
        // int v=sc.nextInt();
        // System.out.println(v);

        A obj=new A();
        obj.temp();
    }
}
