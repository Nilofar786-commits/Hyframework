package InterviewQuestionPractice2;

import java.util.HashMap;
import java.util.Map;

public class Duplicateword {

    public static void main(String[] args) {

        String str="bread butter bread butter";
        String[] s=str.split(" ");
        Map<String,Integer> m=new HashMap<String,Integer>();

        for(String st:s)
        {
            if(m.containsKey(st))
            {
                m.put(st,m.get(st)+1);
            }
            else
                m.put(st,1);
        }

        for(String st:m.keySet())
        {
            if(m.get(st)>1)
            {
                System.out.println("Occurance of "+st +" is "+m.get(st));
            }
        }

    }
}
