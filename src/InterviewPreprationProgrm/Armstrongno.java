package InterviewPreprationProgrm;

import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no,r,arm=0;
        System.out.println("enter no:");
        no = s.nextInt();
        int temp=no;
        while (no > 0 )
        {
            r=no%10;
            arm=arm+r*r*r;
            no=no/10;
        }
        if(arm==temp)
        {
            System.out.println("given no is armstrong:"+arm);
        }
        else
        {
            System.out.println("given no is not armstrong:"+arm);
        }

    }
}
