package InterviewPreprationProgrm;

import java.util.Scanner;

public class Primeno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i;
        System.out.println("Enter no:");
        a = sc.nextInt();
        if(a==1)
        {
            System.out.println("Given no is prime");
        }
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.println("Given no is not prime");
                break;
            }
        }
        if(a==i)
        {
            System.out.println("Given no is prime");
        }
    }
}
