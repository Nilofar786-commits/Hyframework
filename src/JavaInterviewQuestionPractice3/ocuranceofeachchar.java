package JavaInterviewQuestionPractice3;

import java.util.HashMap;
import java.util.Map;

public class ocuranceofeachchar {
    //Write java program to count occurance of each char in string
    //All is well

    public static void main(String[] args) {

        String str="All is well";
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
        for(Character c: m.keySet())
        {
            if(m.get(c)>1)
           System.out.println("Occurance of "+c +" is "+m.get(c));
        }

    }
}
