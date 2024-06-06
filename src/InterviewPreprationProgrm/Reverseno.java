package InterviewPreprationProgrm;

import java.util.Scanner;

public class Reverseno {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int no;
        int rev=0;
        int r,a;
        System.out.println("enter no:");
        no=s.nextInt();

        while(no>0)
        {
            r = no % 10;
            rev = rev*10+r;
            no = no / 10;
        }

        System.out.println("Reversal of given no is:"+rev);



    }
}
