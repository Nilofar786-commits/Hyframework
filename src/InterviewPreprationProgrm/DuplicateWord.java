package InterviewPreprationProgrm;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter any valid String:\n");
        String str = sc.next();//Nilo has nilo
        sc.close();*/
        String str="bread and butter bread";

        String[] strdemo = str.split(" ");

        Map<String, Integer> m = new HashMap<String, Integer>();

        for (String s : strdemo)
        {
               System.out.println("***********");
            if (m.containsKey(s.toLowerCase()))
            {
                System.out.println("++++++++++++++"+m.get(s.toLowerCase()));
                m.put(s.toLowerCase(), m.get(s.toLowerCase()) + 1);
            }
            else
                m.put(s, 1);
        }

        for (String s : m.keySet()) {
            if (m.get(s) > 1)
            {
                System.out.println("Given word " + s + "repeated " + m.get(s));
            }
        }
    }
}
