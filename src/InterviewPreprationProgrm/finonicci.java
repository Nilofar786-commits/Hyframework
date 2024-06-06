package InterviewPreprationProgrm;

import java.util.Scanner;

public class finonicci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no;
        System.out.println("enter no:");
        no = s.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < no; i++) {
            System.out.println(" " + a);
            c = a + b;
            a = b;
            b=c;

        }
    }

}
