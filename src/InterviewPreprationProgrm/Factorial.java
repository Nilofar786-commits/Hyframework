package InterviewPreprationProgrm;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        int fact=1;
        System.out.println("enter no:");
        a=s.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorila of given no is:"+fact);



    }
}
