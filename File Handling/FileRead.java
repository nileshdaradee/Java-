//Reading File

package File Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class FileRead {

    public static void main(String[] args)
    {
    
        try {
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
          
            
          	while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
          
            Reader.close();
        }
        
   
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
    

