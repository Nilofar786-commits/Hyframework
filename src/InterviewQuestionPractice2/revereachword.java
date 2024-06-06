package InterviewQuestionPractice2;

public class revereachword {
    public static void main(String[] args) {
        String str="Nilo far";
        String[] words=str.split(" ");
        String rev="";

        for(String w:words)
        {
            String revword="";

            for(int j=w.length()-1;j>=0;j--)
            {
                revword=revword+w.charAt(j);
                System.out.println(w.charAt(j));
            }
            rev=rev+revword+" ";
        }

        System.out.println("Reverse ecah words as:"+rev);


    }
}
