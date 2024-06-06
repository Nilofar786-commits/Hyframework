package ClassDemo;

import java.util.Scanner;

public class secondClassDemo
{


    public static void main(String[] args)
    {
         CalculatorDemo obj=new CalculatorDemo();
         Scanner sca=new Scanner(System.in);

        System.out.println("Name is :"+obj.name+" "+ obj.Lname);

        System.out.println("Enter 1st num:");
        int a=sca.nextInt();
        System.out.println("Enter 2nd num:");
        int b=sca.nextInt();

        int ans=obj.sum(a,b);

        System.out.println("Addition is:"+ans);

        System.out.println("Enter 1st num:");
        double a1=sca.nextDouble();
        System.out.println("Enter 2nd num:");
        double b1=sca.nextDouble();

         double d=obj.sub(a1,b1);
        System.out.println("Substraction is:"+d);

    }
}
