package InterviewPreprationProgrm;

import java.util.Scanner;

public class PalindromNo
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no, r, rev = 0;
        System.out.println("enter no:");
        no = s.nextInt();
        int temp = no;
        while (no > 0) {
            r = no % 10;
            rev = rev * 10 + r;
            no = no / 10;
        }
        if(temp==rev)
        {
            System.out.println("Given no is palindrom:"+rev);
        }
        else
            System.out.println("Given no is not palindrom:"+rev);

    }

}
