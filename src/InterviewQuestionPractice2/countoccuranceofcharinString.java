package InterviewQuestionPractice2;

import java.util.HashMap;
import java.util.Map;

public class countoccuranceofcharinString {
    public static void main(String[] args) {

        String str="All is Well";
        char[] ch=str.toCharArray();
        Map<Character,Integer> m=new HashMap<Character,Integer>();

        for(Character c:ch)
        {
            if(m.containsKey(c))
            {
                m.put(c,m.get(c)+1);
            }
            else
                m.put(c,1);
        }

        System.out.println(m);
        for(Character c:m.keySet())
        {
            System.out.println("Occurance of "+c+" is "+m.get(c));
        }

    }
}
