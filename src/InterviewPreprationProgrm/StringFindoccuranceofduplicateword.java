package InterviewPreprationProgrm;



import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class StringFindoccuranceofduplicateword {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any valid String:\n");
        String str=sc.next();//Nilofar
        sc.close();
        char[] ch=str.toCharArray();
       // Map <Character,Integer> m1=new HashMap<Character,Integer>();
        Map <Character,Integer>m=new HashMap<Character,Integer>() ;
        for(Character c:ch)
        {

            if(m.containsKey(c))
            {
                int count=m.get(c)+1;
                m.put(c,m.get(c)+1);

            }
            else
                m.put(c,1);
        }


        for(Character c : m.keySet())
        {
            if(m.get(c)>1)
                System.out.println("Charcter " + c + " repeating " + m.get(c) +" times");
        }


    }
}
