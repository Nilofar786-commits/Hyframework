package InterviewQuestionPractice2;

import java.util.HashMap;
import java.util.Map;

public class DuplicatecharinString {

    public static void main(String[] args) {
        String str="nilofar is nilofar";
        char[] s=str.toCharArray();
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        for(Character sc:s)
        {
            if(m.containsKey(sc))
            {
                m.put(sc,m.get(sc+1));
            }
            else
                m.put(sc,1);
        }

        for(Character ss:m.keySet())
            if (m.get(ss) > 1) {
                System.out.println("Duplicfate charcater is" + ss + " =" + m.get(ss));
            }


    }

}
