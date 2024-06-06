package InterviewPreprationProgrm;

import java.util.Scanner;

public class noofDigitinNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no, r, count=0;
        System.out.println("enter no:");
        no = s.nextInt();

        while(no>0)
        {
            r=no%10;
            no=no/10;
            count++;
        }
        System.out.println("No of Digit in given no:"+count);
    }
}
