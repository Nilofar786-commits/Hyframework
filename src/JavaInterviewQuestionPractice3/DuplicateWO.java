package JavaInterviewQuestionPractice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWO {


    //Program to find duplicate words and their occurance
   // braed butter and bread

    public static void main(String[] args) {

      //  System.out.println("Enter valid string:");
        String str="bread butter and bread";
        Scanner sc=new Scanner(System.in);
       // str=sc.next();

        String[] astr=str.split(" ");

        Map<String,Integer> m=new HashMap<String,Integer>();

        for(String s:astr)
        {
            if(m.containsKey(s))
            {
                m.put(s,m.get(s)+1);
            }
            else
            {
                m.put(s,1);
            }
        }

        for(String s:m.keySet())
        {
           /* if(m.get(s)>1)
            {
                System.out.println("Occurance of "+ s +" is: "+m.get(s));

            }*/
            System.out.println("Occurance of "+ s +" is: "+m.get(s));
        }

    }
}
