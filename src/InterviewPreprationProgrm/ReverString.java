package InterviewPreprationProgrm;

import java.util.Scanner;

public class ReverString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("enter input String");
        str= s.next();
      /*  StringBuffer strb=new StringBuffer(str);
        strb.reverse();
        System.out.println("Reverse of given string:"+strb);*/
        //String[] str1=str.split(" ");
        String tem="";

        for(int i=str.length()-1;i>=0;i--)
        {
            tem=tem+str.charAt(i);
        }
        System.out.println("reverse String:"+tem);

    }
}
