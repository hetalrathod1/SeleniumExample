package Selenium;

public class SwapToString
{
    public static void main(String args[])
    {
        String a= "hello";
        String b= "world";

        System.out.println("befor swap");
        System.out.println(a);
        System.out.println(b);

        a=a+b;//helloworld

        b=a.substring(0,a.length()-b.length());// store string a in string b

        a=a.substring(b.length());// store string b in string a

        System.out.println(a);
        System.out.println(b);

    }
}
