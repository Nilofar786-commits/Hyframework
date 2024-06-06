package SampleProgram;

import java.util.Scanner;

public class PrimeNumber {

    public boolean chkNum(int num)
    {
        if(num==1)
            return  false;

        if (num==2)
            return true;

            for (int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                    return false;
            }

            return true;


    }
    public static void main(String[] args)
    {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sca.nextInt();
        PrimeNumber pm=new PrimeNumber();
        boolean flag=pm.chkNum(num);
        if (!flag)
        System.out.println("given " +num +"is not prime");
        else
            System.out.println("given number " +num +" is prime");

    }
}
