public class Strings {
    public static void main(String args[])
    {
        String s="Nilesh";
        String s1="Nilesh";
        //if value is same then they will have the same addresses in heap
        System.out.println(s);



        //mutable string and immutable string
        //string buffer

        StringBuffer sb=new StringBuffer("Nilesh");
        System.out.println(sb.capacity());
        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(2, "x");
        System.out.println(sb);


        //string builder
    }
}
