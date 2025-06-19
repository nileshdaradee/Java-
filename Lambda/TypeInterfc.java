package Lambda;
//Normal--Functional/SAM--Marker
//SAM--single functiona
//Marker--no function

//Lambda Expression
//it only works with functional interface

import A;

@FunctionalInterface
interface A{
    void show(int h);
    // int add(int a,int b);
    // void run();

}

// class B implements A{
//     public void show()
//     {

//     }
// }



public class TypeInterfc {
  public static void main(String[] args) {
    // A obj=new A() {
    //     public void show()
    //     {
    //         System.out.println("Anonymous class");
    //     }
    // };

    //lambda Expression

    A obj=(int h) ->{
    
            System.out.println("Anonymous class");
        
    };
    

    obj.show(7);
    // int res=(int i,int j)->return i+j;
  }  
}
