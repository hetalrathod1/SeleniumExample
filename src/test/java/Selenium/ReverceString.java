package Selenium;

public class ReverceString
{
    public static void main(String args[])
    {

        // String is imutable class and stringbuffer is mutable class thats why we can use reverse function in stringbuffer
        String a="helloworld";

        //stringbuffer class
        StringBuffer stringBuffer=new StringBuffer(a);
        System.out.println(stringBuffer.reverse());

        //using for loop
        int b=a.length();//
        String rev="";
        for (int i=a.length()-1; i>=0; i--)
        {
              rev=rev+a.charAt(i);
        }
        System.out.println(rev);
    }
}
