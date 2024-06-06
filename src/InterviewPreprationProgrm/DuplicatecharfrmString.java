package InterviewPreprationProgrm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatecharfrmString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the singleString:");
        String str=sc.next();//abad
        Set<Character> s=new HashSet<Character>();

        for(int i=0;i<str.length();i++)
        {
            s.add(str.charAt(i));
        }

        StringBuffer sb=new StringBuffer();
        for(Character c:s)
        {
            sb.append(c);
        }

        System.out.println("String after removing duplicater char:"+sb);
    }
}
