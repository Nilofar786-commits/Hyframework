package JavaInterviewQuestionPractice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class removedupliactechar {
    //write program to remove duplicat char n prnt the string
    //abccsbf=>abcsf
    public static void main(String[] args) {


        String str = "abccsbf";
        char[] ch = str.toCharArray();
        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (Character c:ch)
        {
            if (m.containsKey(c))
            {
                m.put(c,m.get(c));
            }
            else
                m.put(c,1);
        }

        Set<Character> s=m.keySet();
        StringBuffer bf=new StringBuffer();
        for(Character c:s)
        {
            bf.append(c);
        }
        System.out.println("Remove duplicate string:"+bf);
    }

}
