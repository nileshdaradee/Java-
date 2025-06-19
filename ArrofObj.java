import Map.Student;

class Student
{
    int rollno;
    String name;
    int marks;
}


public class ArrofObj {
   public static void main(String args[])
   {
     Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    Student s4=new Student();

    Student student[]=new Student[4];
    student[0]=s1;
    student[0]=s2;
    student[0]=s3;
    student[0]=s4;

    //for each loop
    
    for (Student student2 : student) {
        System.out.println(student2);
    }
   }



}
