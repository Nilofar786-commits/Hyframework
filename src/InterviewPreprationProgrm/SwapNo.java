package InterviewPreprationProgrm;

import java.util.Scanner;

public class SwapNo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st no:");
        a=sc.nextInt();
        System.out.println("Enter 2nd no:");
        b=sc.nextInt();

        System.out.println("Swapping no:");
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("1st no is:"+a);
        System.out.println("2nd no is:"+b);



    }
}
