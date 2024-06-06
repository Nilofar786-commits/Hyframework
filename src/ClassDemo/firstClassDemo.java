package ClassDemo;

import java.util.Scanner;

public class firstClassDemo
{

    public int  sum(int a,int b)
    {
         int c;
       return  c=a+b;
    }

    public static void main(String[] args)
    {
         firstClassDemo obj=new firstClassDemo();
         Scanner sca=new Scanner(System.in);

        System.out.println("Enter 1st num:");
        int a=sca.nextInt();
        System.out.println("Enter 2nd num:");
        int b=sca.nextInt();
         int ans=obj.sum(a,b);
        System.out.println("Addition is:"+ans);
    }
}
