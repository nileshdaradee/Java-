package OOP;
//Abstract Keyword
//abstract method can only be definde by the abstract class
//extended class must ijmplement the abstract method
//multiple abstract methods are possible inside the classes
//implement all abstract methods
//you cannot create the class of the abstract class
//you can make the class as abstract to avoid the compulsory implementation of the abstract method


abstract class Car{

    public abstract void drive();
   

    public void playMusic()
    {
        System.out.println("Playing Music");
    }
}

class WagonR extends Car{
    public void drive()
    {
        System.out.println("WagonR Driving");
    }
}




public class Abstr {
    public static void main(String[] args) {
        
        WagonR obj=new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
