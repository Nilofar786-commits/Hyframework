package JavaInterviewQuestionPractice3;

import javax.swing.plaf.synth.SynthUI;

public class reverse {
    public static void main(String[] args) {

        String str="Nilofar Mulla";
        String[] s=str.split(" ");
        System.out.println(s.length-1);
        String rev=" ";

        for(int i=s.length-1;i>=0;i--)
        {
            System.out.println(s[i]);
            rev=rev+s[i]+" ";
        }
        System.out.println(rev);
    }
}
