package InterviewPreprationProgrm;

import java.util.Scanner;

public class countnowords {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        int count=1;
        System.out.println("len of str"+str.length());
        for(int i=0;i<str.length()-1;i++)
        {
            System.out.println("################3");
            if((str.charAt(i) ==' ') && (str.charAt(i+1)!=' '))
            {
                System.out.println("################55555555555555");
                count++;
            }
        }
        System.out.println("No of count is:"+count);
    }
}
