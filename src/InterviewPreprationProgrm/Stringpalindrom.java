package InterviewPreprationProgrm;

import java.util.Scanner;

public class Stringpalindrom {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("enter input String");
        str = s.next();
        String store=str;
        char ch;
        String temp=" ";
         System.out.println("length of string:"+str.length());
        for(int i=str.length()-1;i>=0;i--)
        {
            ch=str.charAt(i);
            temp=temp+ch;

        }
        System.out.println("Reverse of string:"+temp);
        System.out.println("Original of string:"+store);
        boolean flag=store.equalsIgnoreCase(temp);
        System.out.println("Flag of string:"+flag);
        if(store.equalsIgnoreCase(temp))
        {

            System.out.println("String is palindrom :"+temp);
        }
       else
        {
            System.out.println("String is not  :"+temp);
        }
    }


    }
